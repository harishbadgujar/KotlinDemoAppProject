package com.example.kotlindemoappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlindemoappproject.project.mvvm.PhotoListActivity
import com.example.kotlindemoappproject.project.rxretroftrecycler.ShowActorsActivity
import com.example.kotlindemoappproject.project.sigletonproj.SinglTonclasssActivity
import com.example.kotlindemoappproject.project.staticdatarecycler.StaticDataRecyclerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startOperatorsActivity(view: View?) {

        startActivity(Intent(this@MainActivity, StaticDataRecyclerActivity::class.java))

    }

    fun SingltonclasssActivity(view: View?) {

        startActivity(Intent(this@MainActivity, SinglTonclasssActivity()::class.java))

    }

    fun startNetworkingActivity(view: View?) {

        startActivity(Intent(this@MainActivity, ShowActorsActivity::class.java))

    }

    fun startMVVMActivity(view: View?) {

        startActivity(Intent(this@MainActivity, PhotoListActivity::class.java))

    }
}