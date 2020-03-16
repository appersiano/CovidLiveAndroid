package com.appersiano.covid.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.appersiano.covid.R
import kotlinx.android.synthetic.main.covid_card.view.*

class CovidCard(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.covid_card, this, true)
    }

    fun setTitle(title: String) {
        tvTitle.text = title
    }

    fun setDelta(delta: String) {
        tvDelta.visibility = View.VISIBLE
        tvDelta.text = delta
    }

    fun setTotalValue(totalValue: Int) {
        tvTotalValue.text = totalValue.toString()
    }

    fun setSubDesc(subdesc: String) {
        tvSubDesc.visibility = View.VISIBLE
        tvSubDesc.text = subdesc
    }
}