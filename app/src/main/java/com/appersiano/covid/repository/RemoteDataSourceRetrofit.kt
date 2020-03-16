package com.appersiano.covid.repository

import android.content.Context
import com.appersiano.covid.repository.model.CovidDataNazione
import com.appersiano.covid.repository.model.CovidDataRegione
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

/**
 * RemoteDataSourceRetrofit is the REST client who is in charge to make all the requests to BE
 */
class RemoteDataSourceRetrofit(var mContext: Context) {

    private var client: GithubCovidService
    private val BASE_URL = "https://raw.githubusercontent.com/pcm-dpc/COVID-19/master/dati-json/"

    init {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val logInterClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val moshiBuilder = MoshiConverterFactory.create(
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
        )

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(moshiBuilder.asLenient())
            .client(logInterClient)
            .build()


        client = retrofit.create(GithubCovidService::class.java)
    }

    suspend fun getSituazioneNazionale(): ResponseApi<List<CovidDataNazione>> {
        val ret = client.getSituazioneNazionale()

        return if (ret.isSuccessful) {
            ResponseApi.Success(ret.body()!!)
        } else {
            ResponseApi.Error
        }
    }

    suspend fun getSituazioneRegionale(): ResponseApi<List<CovidDataRegione>> {
        val ret = client.getSituazioneRegionale()

        return if (ret.isSuccessful) {
            ResponseApi.Success(ret.body()!!)
        } else {
            ResponseApi.Error
        }
    }

    companion object : Singleton<RemoteDataSourceRetrofit, Context>(::RemoteDataSourceRetrofit)
}

sealed class ResponseApi<out T> {
    //object Loading : ResponseApi<Nothing>()
    data class Success<T>(val item: T) : ResponseApi<T>()
    object Error : ResponseApi<Nothing>()
}

open class Singleton<out T, in A>(private val constructor: (A) -> T) {

    @Volatile
    private var instance: T? = null

    fun getInstance(arg: A): T {
        return when {
            instance != null -> instance!!
            else -> synchronized(this) {
                if (instance == null) instance = constructor(arg)
                instance!!
            }
        }
    }
}