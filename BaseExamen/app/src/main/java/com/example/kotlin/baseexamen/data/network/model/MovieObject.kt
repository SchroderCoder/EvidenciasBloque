package com.example.kotlin.baseexamen.data.network.model

import com.google.gson.annotations.SerializedName

data class MovieObject (
    @SerializedName("count") val count : Int,
    @SerializedName("results") val results: ArrayList<MovieBase>,
)