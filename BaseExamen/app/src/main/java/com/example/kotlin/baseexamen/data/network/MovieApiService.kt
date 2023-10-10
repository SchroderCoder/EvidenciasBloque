package com.example.kotlin.baseexamen.data.network

import com.example.kotlin.baseexamen.data.network.model.MovieObject
import retrofit2.http.GET

interface MovieApiService {
    @GET("movie/popular?api_key=72523c16064b81c9e100b0632002ba3f")
    suspend fun getMovieList(

    ) : MovieObject
}