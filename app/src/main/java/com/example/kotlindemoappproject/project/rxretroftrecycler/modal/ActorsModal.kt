package com.example.kotlindemoappproject.project.rxretroftrecycler.modal

import com.google.gson.annotations.SerializedName

data class ActorsModal(
    @SerializedName("albumId")
    var albumId: kotlin.Int,
    @SerializedName("id")
    var id: kotlin.Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: String
)