package com.appersiano.covid.ui.nazione

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appersiano.covid.repository.RemoteDataSourceRetrofit
import com.appersiano.covid.repository.ResponseApi
import com.appersiano.covid.repository.model.CovidDataNazione
import kotlinx.coroutines.launch

class NazioneViewModel : ViewModel() {

    private val covidNazione = MutableLiveData<CovidDataNazione>()
    val covidNazioneLV: LiveData<CovidDataNazione> = covidNazione

    fun getData(context: Context) {
        viewModelScope.launch {
            val data = RemoteDataSourceRetrofit.getInstance(context)

            val situazioneNazionale = data.getSituazioneNazionale()

            when (situazioneNazionale) {
                is ResponseApi.Success -> {
                    val data = situazioneNazionale.item
                    manageResponse(data)
                }
                ResponseApi.Error -> {
                    //show error
                }
            }
        }
    }

    private fun manageResponse(data: List<CovidDataNazione>) {
        val lastData = data[data.size - 1]
        covidNazione.postValue(lastData)
    }
}