package com.example.sun_project_10_7.data.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sun_project_10_7.R
import com.example.sun_project_10_7.R.id.item_image
import com.example.sun_project_10_7.R.id.item_title
import com.example.sun_project_10_7.data.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
        class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(item_title)
            val imageView: ImageView = view.findViewById(item_image)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}