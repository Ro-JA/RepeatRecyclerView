package com.example.repeatrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.repeatrecyclerview.adapter.ItemAdapter
import com.example.repeatrecyclerview.data.Datasource
import com.example.repeatrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      /*  val myDataSet = Datasource().loadMessages()
        binding.recyclerView.adapter = ItemAdapter(this, myDataSet)
        binding.recyclerView.setHasFixedSize(true)*/

    }

    private fun init(){
        val myDatasource = Datasource().loadMessages()
        binding.apply {
            recyclerView.adapter = ItemAdapter(this@MainActivity, myDatasource)
            recyclerView.setHasFixedSize(true)
            button.setOnClickListener {
                if (index > 9) index = 0
                val messages = myDatasource[index]

            }
        }
    }
}