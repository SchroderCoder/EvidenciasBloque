package com.example.kotlin.baseexamen.data

import com.example.kotlin.baseexamen.data.network.MovieApiClient
import com.example.kotlin.baseexamen.data.network.model.MovieObject

class MovieRespository {
    private val apiMovie = MovieApiClient()

    suspend fun getMovieList(): MovieObject? = apiMovie.getMovieList()
}