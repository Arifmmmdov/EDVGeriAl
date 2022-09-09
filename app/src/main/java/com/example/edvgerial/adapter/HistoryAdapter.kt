package com.example.edvgerial.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.edvgerial.R
import com.example.edvgerial.model.HistoryItems

class HistoryAdapter(private val historyItems: List<HistoryItems>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val itemText: TextView = itemView.findViewById(R.id.txt_center_item_history)
        private val subItemText: TextView = itemView.findViewById(R.id.txt_center_subItem_history)
        private val payment: TextView = itemView.findViewById(R.id.txt_history_payment)
        private val imageHistory: ImageView = itemView.findViewById(R.id.img_history_item)

        fun initialItems(items: HistoryItems){
            itemText.text = items.item
            subItemText.text = items.subItem
            payment.text = items.payment
            imageHistory.setBackgroundResource(items.imgResource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyc_history,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initialItems(historyItems[position])
    }

    override fun getItemCount(): Int = historyItems.size
}