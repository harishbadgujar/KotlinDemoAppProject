package com.example.kotlindemoappproject.project.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindemoappproject.R
import com.example.kotlindemoappproject.databinding.ActivityHomeBinding
import com.example.kotlindemoappproject.project.mvvm.adapter.PhotoAdapter
import com.example.kotlindemoappproject.project.mvvm.modal.PhotoModal
import com.example.kotlindemoappproject.project.rxretroftrecycler.actorsAdapter
import com.example.kotlindemoappproject.project.rxretroftrecycler.modal.ActorsModal
import kotlinx.android.synthetic.main.activity_photo_list.*
import kotlinx.android.synthetic.main.activity_photo_list.recyclerView
import kotlinx.android.synthetic.main.activity_show_actors2.*

class PhotoListActivity : AppCompatActivity() {

    private lateinit var photoAdapter: PhotoAdapter

    // val photoList : List<PhotoModal>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_list)

        // val binding : ActivityHomeBinding = DataBindingUtil.setContentView(this,R.layout.activity_photo_list)
        val viewModel = ViewModelProvider(this).get(PhotoViewModal::class.java)



       // photoAdapter = PhotoAdapter(mutableListOf(), this)


        viewModel.photoLiveDataList.observe(this, Observer {

            //  Log.d("photoTag102034", "${it.get(0).title}")
            // adapter.setMovieList(it)

            /* if (it != null) {
                 for (element in it) {

                     element?.title?.let { Log.d("photoTagjuly102034", it) }

                 }
             }*/

            photoAdapter = PhotoAdapter(it, PhotoListActivity@ this)
            photoAdapter.addPhotos(it)

            recyclerView.apply {

                recyclerView.adapter = photoAdapter
                recyclerView.layoutManager =
                    LinearLayoutManager(this@PhotoListActivity, LinearLayoutManager.VERTICAL, false)
            }

        })

        viewModel.getAllPhotos()
        //viewModel.getAllMovies()

    }
}


