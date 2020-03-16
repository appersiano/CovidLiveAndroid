package com.appersiano.covid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appersiano.covid.R
import com.appersiano.covid.repository.model.CovidDataRegione

internal class RegioneCovidAdapter(
    private val context: Context
) : RecyclerView.Adapter<RegioneCovidAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    private val data = mutableListOf<CovidDataRegione>()

    fun addListRegioni(results: List<CovidDataRegione>) {
        clearScanResults()

//        data.sortByDescending { it.macAddress }

        data.addAll(results)
        notifyDataSetChanged()
    }

    fun clearScanResults() {
        data.clear()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        with(data[position]) {
//            holder.tvBleName.text = bleName
//            holder.tvMacAddress.text = macAddress
//            holder.tvStatus.text = statusConnection
//            holder.tvBatteryLevel.text = batteryLevel.toString()
//            holder.tvSerialValue.text = serial
//            holder.tvLockStatusValue.text = lockStatus
//            holder.itemView.setOnClickListener {
//                onClickListener(this)
//            }
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_regione, parent, false)
            .let { ViewHolder(it) }

}