package com.example.kotlindemoappproject.project.mvvm.network

import com.example.kotlindemoappproject.project.mvvm.modal.PhotoModal
import com.example.kotlindemoappproject.project.rxretroftrecycler.modal.ActorsModal
import retrofit2.Call
import retrofit2.http.GET

interface MyApi {

    @GET("photos")
    fun getMyPhotos(): Call<List<PhotoModal>>
}