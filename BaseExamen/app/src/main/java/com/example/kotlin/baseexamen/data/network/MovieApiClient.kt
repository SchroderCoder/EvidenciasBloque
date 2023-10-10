package com.example.kotlin.baseexamen.data.network

class MovieApiClient {
    private lateinit var api: MovieApiService

    suspend fun getMovieList(): com.example.kotlin.baseexamen.data.network.model.MovieObject? {
        api = NetworkModuleDI()
        return try {
            api.getMovieList()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
            null
        }

    }


}