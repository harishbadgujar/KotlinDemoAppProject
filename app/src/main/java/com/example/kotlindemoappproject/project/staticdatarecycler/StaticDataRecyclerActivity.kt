package com.example.kotlindemoappproject.project.staticdatarecycler

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemoappproject.R
import com.example.kotlindemoappproject.project.staticdatarecycler.adapter.CustomAdapter
import com.example.kotlindemoappproject.project.staticdatarecycler.modal.User

class StaticDataRecyclerActivity : AppCompatActivity() {


    // https://www.simplifiedcoding.net/

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_data_recycler)


        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Rajendra Badgujar", "Maharashtra"))
        users.add(User("Harish Badgujar", "Jalgaon"))
        users.add(User("Surekha Badgujar", "Mudi"))
        users.add(User("Pooja", "Dhule"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}