package com.example.repeatrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.repeatrecyclerview.MainActivity
import com.example.repeatrecyclerview.R
import com.example.repeatrecyclerview.databinding.ListItemBinding
import com.example.repeatrecyclerview.model.Messages

class ItemAdapter(private val context: MainActivity, private val dataset: List<Messages>) : // создаем класс адаптер наследуемся от ресайкл адаптера
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    val messagesList = ArrayList<Messages>() // создаем список дата классов
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) { // создаем класс вьюхолдер который наследуеться от Ресайкл вьюхолдер
        private val binding = ListItemBinding.bind(view) // создаем биндинг класс для превязки вьюшек
        fun bind(messages: Messages) = with(binding) { // функция для превязки вьюшек
            imageView.setImageResource(messages.drawableRes)
            textView.text= messages.stringResources.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { // создаем нашу ячеку в списке
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size // возрощаем размер нащего списка

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(messagesList[position])

        }

    fun addMessage(messages: Messages) {
        messagesList.add(messages)
        notifyDataSetChanged()
    }


    }
