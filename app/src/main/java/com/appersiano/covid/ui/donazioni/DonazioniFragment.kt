package com.appersiano.covid.ui.donazioni

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.appersiano.covid.R
import kotlinx.android.synthetic.main.fragment_donazioni.*


class DonazioniFragment : Fragment() {

    private lateinit var donazioniViewModel: DonazioniViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        donazioniViewModel =
                ViewModelProviders.of(this).get(DonazioniViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_donazioni, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvRegioneLombardia.setOnClickListener {
            openLink("https://www.regione.lombardia.it/wps/portal/istituzionale/HP/DettaglioRedazionale/servizi-e-informazioni/cittadini/salute-e-prevenzione/coronavirus/coronavirus-raccolta-fondi")
        }

        tvNiguarda.setOnClickListener {
        openLink("https://www.gofundme.com/f/aiutiamo-ospedale-niguarda-covid19")
        }

        tvSacco.setOnClickListener {
            openLink("https://www.gofundme.com/f/aiutiamo-la-rianimazione-dell039ospedale-sacco")

        }

        tvSpallanzani.setOnClickListener {
            openLink("https://www.ilfoglio.it/sezioni/714/donazioni-spallanzani")

        }

        tvMaggioreDiParma.setOnClickListener {
            openLink("https://www.ao.pr.it/la-squadra-piu-forte-di-parma-dal-parma-calcio-donazione-di-25-000-euro/")

        }


        tvCotugnoNapoli.setOnClickListener {
            openLink("https://www.gofundme.com/f/raccolta-fondi-per-il-cotugno-di-napolicovid19")

        }

        tvAnnaComo.setOnClickListener {
            openLink("https://www.gofundme.com/f/aiutami-la-terapia-intensiva-santanna")

        }
    }

    fun openLink(url : String){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }
}
