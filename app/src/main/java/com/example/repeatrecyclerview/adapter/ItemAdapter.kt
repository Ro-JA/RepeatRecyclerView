package com.example.repeatrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.repeatrecyclerview.R
import com.example.repeatrecyclerview.model.Messages

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Messages>
) : // создаем класс адаптер наследуемся от ресайкл адаптера
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) :
        RecyclerView.ViewHolder(view) { // создаем класс вьюхолдер который наследуеться от Ресайкл вьюхолдер
        val textView: TextView = view.findViewById(R.id.textView)
        val imageView: ImageView = view.findViewById(R.id.imageView)

    }

    //в том классе надо реализвоать три метода
    //Это метод надывает нашу вьюшку и возращает ее
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    // это метод принимает парметр нашу вьюшку и на каокй позиций она находиться и ложит в нее даные
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    // это метод возращает размер нашего списка для того что бы viewHolder знал сколько элементов создовать
    override fun getItemCount() = dataset.size
}
