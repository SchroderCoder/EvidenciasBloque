package com.example.kotlin.baseexamen.domain

import com.example.kotlin.baseexamen.data.MovieRepository
import com.example.kotlin.baseexamen.data.network.model.MovieObject

class MovieListRequirement {

    private val repository = MovieRepository()

    suspend operator fun invoke(
    ): MovieObject? = repository.getMovieList()
}