package com.example.repeatrecyclerview.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.repeatrecyclerview.databinding.ListItemBinding
import com.example.repeatrecyclerview.model.Messages

class ItemAdapter(private val context: Context, private val dataset: List<Messages>) {
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val binding = ListItemBinding.bind(view)
    }
}