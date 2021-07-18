package com.example.kotlindemoappproject.project.mvvm

import android.content.Context
import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.MutableLiveData
import com.example.kotlindemoappproject.project.mvvm.modal.PhotoModal
import com.example.kotlindemoappproject.project.mvvm.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class PhotoRepository(){

    //https://howtodoandroid.com/mvvm-retrofit-recyclerview-kotlin/

    fun photoData(photoDataInterface: PhotoDataInterface)  {

        var photoResponce: List<PhotoModal>?

        val call: Call<List<PhotoModal>> = RetrofitClient.getClient.getMyPhotos()
        call.enqueue(object : Callback<List<PhotoModal>> {
            override fun onResponse(call: Call<List<PhotoModal>>?, response: Response<List<PhotoModal>>?) {

                var msg: Int? = response?.code()

                if (msg == 200) {

                     photoResponce   = response?.body()

                    photoResponce?.let { photoDataInterface.photoDataa(it) }

                    if (photoResponce != null) {
                        for (element in photoResponce!!) {

                            element?.title?.let { Log.d("photoTag102033", it) }

                        }
                    }



                }

               // photoResponce.addAll(response!!.body()!!)
            }

            override fun onFailure(call: Call<List<PhotoModal>>?, t: Throwable?) {

                t?.stackTrace
            }
        })

       // return photoResponce
    }



    fun getPhotoData() = RetrofitClient.getClient.getMyPhotos()

}