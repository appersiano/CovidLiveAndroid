package com.appersiano.covid.ui.regione

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.appersiano.covid.R
import kotlinx.android.synthetic.main.fragment_nazione.*

class RegioneFragment : Fragment() {

    private lateinit var regioneViewModel: RegioneViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        regioneViewModel =
            ViewModelProviders.of(this).get(RegioneViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_regione, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        regioneViewModel.getData(context!!)

        regioneViewModel.covidRegioneLV.observe(viewLifecycleOwner, Observer {


        })
    }
}
