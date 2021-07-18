package com.example.kotlindemoappproject.project.mvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.kotlindemoappproject.project.mvvm.modal.PhotoModal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhotoViewModal(val applications: Application) : AndroidViewModel(applications),PhotoDataInterface {


        var photoLiveDataList = MutableLiveData<List<PhotoModal>>()







    fun getAllPhotos(){

        PhotoRepository().photoData(this)


    }

    override fun photoDataa(resp: List<PhotoModal>) {

        photoLiveDataList.value = resp
    }




    fun getAllMovies() {

        val response = PhotoRepository().getPhotoData()
        response.enqueue(object : Callback<List<PhotoModal>> {
            override fun onResponse(call: Call<List<PhotoModal>>, response: Response<List<PhotoModal>>) {
                photoLiveDataList.postValue(response.body())
            }

            override fun onFailure(call: Call<List<PhotoModal>>, t: Throwable) {
            }
        })
    }




}