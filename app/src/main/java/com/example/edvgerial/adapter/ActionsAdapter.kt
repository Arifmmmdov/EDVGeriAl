package com.example.edvgerial.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.example.edvgerial.R
import com.example.edvgerial.fragment.viewpagersfragments.FragmentChanger
import com.example.edvgerial.model.ActionItems

class ActionsAdapter(private val actionItems: List<ActionItems>,private val changer: FragmentChanger) : RecyclerView.Adapter<ActionsAdapter.ViewHolder>() {


    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        private val itemText:TextView = itemView.findViewById(R.id.txt_action_item)
        private val itemImage:ImageView = itemView.findViewById(R.id.img_action_item)
        private val mainActionItem = itemView.findViewById<ConstraintLayout>(R.id.action_item)


        fun initializeItemText(item: String){
            itemText.text = item
        }

        fun initializeItemImage(img:Int){
            itemImage.setImageResource(img)
        }

        fun setOnClickListener(position: Int,changer: FragmentChanger){
            mainActionItem.setOnClickListener{
                changer.changeFragment(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyc_actions,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initializeItemText(actionItems[position].text)
        holder.initializeItemImage(actionItems[position].img)
        holder.setOnClickListener(position,changer)
    }

    override fun getItemCount(): Int = actionItems.size
}