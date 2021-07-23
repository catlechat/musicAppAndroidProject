package com.ivan.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ivan.musicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}