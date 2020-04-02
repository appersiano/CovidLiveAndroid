package com.appersiano.covid.ui.nazione

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.appersiano.covid.R
import kotlinx.android.synthetic.main.fragment_nazione.*

class NazioneFragment : Fragment() {

    private lateinit var nazioneViewModel: NazioneViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nazioneViewModel =
            ViewModelProviders.of(this).get(NazioneViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nazione, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nazioneViewModel.getData(context!!)

        with(cvPositivi) {
            setTitle("Positivi 😷")
        }

        with(cvGuariti) {
            setTitle("Guariti 😊")
        }

        with(cvDeceduti) {
            setTitle("Deceduti 😢")
        }

        nazioneViewModel.covidNazioneLV.observe(viewLifecycleOwner, Observer {
            tvLastUpdated.text =  "Ultimo aggiornamento ${it.data}"

            with(cvPositivi) {
                setDelta("+${it.variazione_totale_positivi} da ieri")
                setTotalValue(it.totale_positivi)
                setSubDesc("Totali fino ad oggi ${it.totale_casi}")
            }

            with(cvGuariti) {
                setTotalValue(it.dimessi_guariti)
            }

            with(cvDeceduti) {
                setTotalValue(it.deceduti)
            }
        })

    }
}
