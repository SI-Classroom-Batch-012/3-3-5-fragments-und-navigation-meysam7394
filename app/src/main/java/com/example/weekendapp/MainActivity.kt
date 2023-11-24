package com.example.weekendapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: List<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = listOf()

        foodList = mutableListOf(
            Food(R.drawable.pasta, "Pasta"),
            Food(R.drawable.spinat, "Spinat Pasta "),
            Food(R.drawable.tomaten, "Tomaten Pasta"),
            Food(R.drawable.parmesan, "Parmesan Pasta"),
            Food(R.drawable.basilikum, "Basilikum Pasta")


        )


        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter
    }
}
