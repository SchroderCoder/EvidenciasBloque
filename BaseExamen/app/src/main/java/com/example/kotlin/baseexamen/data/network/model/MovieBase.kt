package com.example.kotlin.baseexamen.data.network.model

import com.google.gson.annotations.SerializedName

data class MovieBase (
    @SerializedName("title") val title : String?,
    @SerializedName("poster_path") val poster_path : String?

)