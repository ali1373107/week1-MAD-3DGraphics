package com.example.week1_mad_3dgraphics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MudoleName = listOf("data science","Math" , "ML")
        val MudoleDescription = listOf(" two hour in person class weekly " , "Learning advanced mathematics " ," Machine Leaning ")
        val MudoleListView = findViewById<RecyclerView>(R.id.MudoleListView)
        MudoleListView.layoutManager = LinearLayoutManager(this)
        MudoleListView.adapter = MyAdapter(MudoleName,MudoleDescription)
    }

}