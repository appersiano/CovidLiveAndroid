package com.appersiano.covid.util

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.appersiano.covid.R


class ExpendableRecyclerViewAdapter(var context: Context?, var faqList: List<FAQ>) :
    RecyclerView.Adapter<ExpendableRecyclerViewAdapter.FAQViewHolder>() {

    var cacheOpenedFAQ = mutableListOf<Boolean>()

    init {
        cacheOpenedFAQ.addAll(faqList.map { false })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FAQViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_faq_expand, parent, false)
        return FAQViewHolder(view)
    }


    override fun onBindViewHolder(holder: FAQViewHolder, position: Int) {
        val tvTitle = holder.itemView.findViewById<TextView>(R.id.tvTitle)
        val tvDesc = holder.itemView.findViewById<TextView>(R.id.tvDescription)
        val expand = holder.itemView.findViewById<ImageView>(R.id.imgExpand)
        val llExpand = holder.itemView.findViewById<LinearLayout>(R.id.layoutExpand)
        val rootLL = holder.itemView.findViewById<LinearLayout>(R.id.rootll)

        val faq = faqList[holder.adapterPosition]

        tvTitle.text = faq.title
        tvDesc.text = faq.description

        //Cache is fundamental to coherence, you want only to find opened FAQ
        if (isExpanded(holder.adapterPosition)) {
            llExpand.visibility = View.VISIBLE
            expand.rotation = 45f
        } else {
            llExpand.visibility = View.GONE
            expand.rotation = 0f
        }

        tvTitle.setOnClickListener {
            expandFun(llExpand, holder, expand)
        }

        expand.setOnClickListener {
            expandFun(llExpand, holder, expand)
        }
    }

    private fun expandFun(
        llExpand: LinearLayout,
        holder: FAQViewHolder,
        expand: ImageView
    ) {
        if (llExpand.visibility == View.GONE) {
            cacheOpenedFAQ[holder.adapterPosition] = true
            expand.animate().rotation(45f)
            llExpand.visibility = View.VISIBLE

        } else {
            cacheOpenedFAQ[holder.adapterPosition] = false
            expand.animate().rotation(0f)
            llExpand.visibility = View.GONE
        }
    }

    private fun isExpanded(adapterPosition: Int) = cacheOpenedFAQ[adapterPosition]

    override fun getItemCount(): Int = faqList.size

    class FAQViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}