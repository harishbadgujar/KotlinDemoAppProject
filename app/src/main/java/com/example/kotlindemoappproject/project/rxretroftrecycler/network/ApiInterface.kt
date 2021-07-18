package com.example.kotlindemoappproject.project.rxretroftrecycler.network

import com.example.kotlindemoappproject.project.rxretroftrecycler.modal.ActorsModal
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("photos")
    fun getPhotos(): Call<List<ActorsModal>>
}