package com.example.kotlindemoappproject.project.mvvm.modal

import com.google.gson.annotations.SerializedName

data class PhotoModal(
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
) {


}