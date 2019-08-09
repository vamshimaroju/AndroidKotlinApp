package com.example.firebasefcm

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgView = findViewById<ImageView>(R.id.imgIcon);
        imgView.setOnClickListener {

            val text = "Hello! Vamshi"
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(applicationContext,text,duration)

            toast.show();

        }
    }


}
