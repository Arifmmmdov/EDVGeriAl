package com.example.edvgerial.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.edvgerial.R
import com.example.edvgerial.model.ActionItems

class ActionsAdapter(private val actionItems: List<ActionItems>) : RecyclerView.Adapter<ActionsAdapter.ViewHolder>() {


    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        private val itemText:TextView = itemView.findViewById(R.id.txt_action_item)
        private val itemImage:ImageView = itemView.findViewById(R.id.img_action_item)

        fun initializeItemText(item: String){
            itemText.text = item
        }

        fun initializeItemImage(img:Int){
            itemImage.setImageResource(img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyc_actions,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initializeItemText(actionItems[position].text)
        holder.initializeItemImage(actionItems[position].img)
    }

    override fun getItemCount(): Int = actionItems.size
}