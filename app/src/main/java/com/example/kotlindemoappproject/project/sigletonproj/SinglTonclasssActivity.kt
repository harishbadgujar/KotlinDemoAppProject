package com.example.kotlindemoappproject.project.sigletonproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlindemoappproject.R

class SinglTonclasssActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singl_tonclasss)

        Log.d("showData111","${SingltonObj}")
    }
}