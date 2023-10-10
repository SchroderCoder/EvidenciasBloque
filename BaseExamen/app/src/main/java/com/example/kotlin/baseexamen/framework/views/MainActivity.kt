package com.example.kotlin.baseexamen.framework.views

import android.app.Activity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.baseexamen.data.network.model.MovieBase
import com.example.kotlin.baseexamen.databinding.ActivityMainBinding
import com.example.kotlin.baseexamen.framework.adapters.MovieAdapter
import com.example.kotlin.baseexamen.framework.viewmodels.MainViewModel

class MainActivity: AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    private val adapter: MovieAdapter = MovieAdapter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeBinding()
        initializeObservers()
        viewModel.getMovieList()
    }

    private fun initializeBinding(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<MovieBase>){
        binding.RVMovie.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVMovie.layoutManager = linearLayoutManager
        adapter.MovieAdapter(dataForList,this)
        binding.RVMovie.adapter = adapter

    }

    private fun initializeObservers(){
        viewModel.MovieObjectLiveData.observe(this){ MovieObject ->
            setUpRecyclerView(MovieObject.results)
        }
    }
}