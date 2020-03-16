package com.appersiano.covid.repository

import com.appersiano.covid.repository.model.CovidDataNazione
import com.appersiano.covid.repository.model.CovidDataRegione
import retrofit2.Response
import retrofit2.http.GET

interface GithubCovidService {
    @GET("dpc-covid19-ita-andamento-nazionale.json")
    suspend fun getSituazioneNazionale(): Response<List<CovidDataNazione>>

    @GET("dpc-covid19-ita-regioni.json")
    suspend fun getSituazioneRegionale(): Response<List<CovidDataRegione>>

//    @GET("https://raw.githubusercontent.com/pcm-dpc/COVID-19/master/dati-json/dpc-covid19-ita-andamento-nazionale.json")
//    suspend fun getSituazioneProvince(): Response<VehicleListAPI>
}