package com.example.kotlin.baseexamen.framework.adapters.viewholders

import android.content.Context
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlin.baseexamen.data.network.model.MovieBase
import com.example.kotlin.baseexamen.databinding.ItemMovieBinding
//Hacer binding de los componentes de item movie con los datos obtenidos en el llamado a la función
class MovieViewHolder (private val binding : ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: MovieBase, context: Context){
        val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
        binding.title.text = item.title
        Glide.with(itemView).load(IMAGE_BASE + item.poster_path ).into(binding.poster)

    }
}