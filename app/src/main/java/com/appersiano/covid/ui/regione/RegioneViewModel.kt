package com.appersiano.covid.ui.regione

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appersiano.covid.repository.RemoteDataSourceRetrofit
import com.appersiano.covid.repository.ResponseApi
import com.appersiano.covid.repository.model.CovidDataNazione
import com.appersiano.covid.repository.model.CovidDataRegione
import kotlinx.coroutines.launch

class RegioneViewModel : ViewModel() {

    private val covideRegione = MutableLiveData<CovidDataRegione>()
    val covidRegioneLV: LiveData<CovidDataRegione> = covideRegione

    fun getData(context: Context) {
        viewModelScope.launch {
            val data = RemoteDataSourceRetrofit.getInstance(context)

            val situazioneRegionale = data.getSituazioneRegionale()

            when (situazioneRegionale) {
                is ResponseApi.Success -> {
                    manageResponse(situazioneRegionale.item)
                }
                ResponseApi.Error -> {
                    //show error
                }
            }
        }
    }

    private fun manageResponse(data: List<CovidDataRegione>) {
        val lastData = data[data.size - 1]
        covideRegione.postValue(lastData)
    }
}