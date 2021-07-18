package com.example.kotlindemoappproject.project.rxretroftrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindemoappproject.R
import com.example.kotlindemoappproject.project.rxretroftrecycler.adapter.ActorsAdapter
import com.example.kotlindemoappproject.project.rxretroftrecycler.modal.ActorsModal
import com.example.kotlindemoappproject.project.rxretroftrecycler.network.ApiClient
import kotlinx.android.synthetic.main.activity_show_actors2.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

var actorsAdapter: ActorsAdapter? = null
var actorsList = ArrayList<ActorsModal>()

class ShowActorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_actors2)

        actorsAdapter = ActorsAdapter(actorsList, this)
        //  recyclerView.adapter = actorsAdapter
        //  recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        recyclerView.apply {

            recyclerView.adapter = actorsAdapter
            recyclerView.layoutManager = LinearLayoutManager(this@ShowActorsActivity, LinearLayoutManager.VERTICAL, false)
        }




        getActorsData()
    }

    private fun getActorsData() {

        progressBar.isVisible = true

        val call: Call<List<ActorsModal>> = ApiClient.getClient.getPhotos()
        call.enqueue(object : Callback<List<ActorsModal>> {
            override fun onResponse(
                call: Call<List<ActorsModal>>?,
                response: Response<List<ActorsModal>>?
            ) {
                progressBar.isVisible = false
                actorsList.addAll(response!!.body()!!)
                recyclerView.adapter!!.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<ActorsModal>>?, t: Throwable?) {

                progressBar.isVisible = false
            }
        })
    }
}