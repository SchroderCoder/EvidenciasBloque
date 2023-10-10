package com.example.kotlin.baseexamen.framework.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin.baseexamen.data.network.model.MovieObject
import com.example.kotlin.baseexamen.domain.MovieListRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//Administra conexión entre activity y model, checando el llamado a la función y actualizando el live data
class MainViewModel : ViewModel(){
    private val MovieListRequirement = MovieListRequirement()
    val MovieObjectLiveData = MutableLiveData<MovieObject>()

    fun getMovieList(){
        viewModelScope.launch (Dispatchers.IO){
            val result: MovieObject? = MovieListRequirement()
            Log.d("Salida", result?.count.toString())
            CoroutineScope(Dispatchers.Main).launch {
                MovieObjectLiveData.postValue(result!!)
            }
        }
    }
}