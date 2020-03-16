package com.appersiano.covid.ui.faq

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.appersiano.covid.R
import com.appersiano.covid.ui.regione.RegioneViewModel
import com.appersiano.covid.util.ExpendableRecyclerViewAdapter
import com.appersiano.covid.util.FactoryCreator
import kotlinx.android.synthetic.main.fragment_faq.*

class FAQFragment : Fragment() {

    private lateinit var regioneViewModel: RegioneViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        regioneViewModel =
            ViewModelProviders.of(this).get(RegioneViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_faq, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterFaq = ExpendableRecyclerViewAdapter(context, FactoryCreator().getFaq())

        rvFaq.apply {
            setHasFixedSize(true)
            adapter = adapterFaq
        }
    }
}
