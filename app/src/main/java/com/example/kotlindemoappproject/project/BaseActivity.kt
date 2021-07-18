package com.example.kotlindemoappproject.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlindemoappproject.R

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}