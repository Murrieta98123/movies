package com.example.movies.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.App
import com.example.movies.R

class MainActivity : AppCompatActivity() {
    private val remoteApi = App.remoteApi



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val reclyclerView = findViewById<RecyclerView>(R.id.recyclerview)



        /*GlobalScope.launch(Dispatchers.Main) {
            val result = remoteApi.getMovies()
            if (result is Success) {
                text_pages.text = "Peliculas disponibles" + result.data.total_results.toString()
                text_total.text = "paginas:" +  result.data.total_pages.toString()
               // result.data.total_results
            }
        }*/

       /* GlobalScope.launch(Dispatchers.Main) {
            val result = remoteApi.getMoviesByPage(2)
            if (result is Success) {
                text_pages.text = "Peliculas disponibles: " + result.data.total_results.toString()
                text_total.text = "paginas:" +  result.data.total_pages.toString()
            }
        }*/

    }
}