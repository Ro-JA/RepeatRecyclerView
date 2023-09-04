package com.example.repeatrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.repeatrecyclerview.R
import com.example.repeatrecyclerview.databinding.ListItemBinding
import com.example.repeatrecyclerview.model.Messages

class ItemAdapter(private val context: Context, private val dataset: List<Messages>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val binding = ListItemBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size // возрощаем размер нащего списка

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        }
    }
