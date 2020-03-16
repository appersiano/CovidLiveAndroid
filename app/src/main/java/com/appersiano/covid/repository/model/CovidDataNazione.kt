package com.appersiano.covid.repository.model


data class CovidDataNazione(
    val data: String,
    val stato: String,
    val ricoverati_con_sintomi: Int,
    val terapia_intensiva: Int,
    val totale_ospedalizzati: Int,
    val isolamento_domiciliare: Int,
    val totale_attualmente_positivi: Int,
    val nuovi_attualmente_positivi: Int,
    val dimessi_guariti: Int,
    val deceduti: Int,
    val totale_casi: Int,
    val tamponi: Int
)

data class CovidDataRegione(
    val data: String,
    val stato: String,
    val ricoverati_con_sintomi: Int,
    val terapia_intensiva: Int,
    val totale_ospedalizzati: Int,
    val isolamento_domiciliare: Int,
    val totale_attualmente_positivi: Int,
    val nuovi_attualmente_positivi: Int,
    val dimessi_guariti: Int,
    val deceduti: Int,
    val totale_casi: Int,
    val tamponi: Int,
    val codice_regione : Int,
    val denominazione_regione : String
)