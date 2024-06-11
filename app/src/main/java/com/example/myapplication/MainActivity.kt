package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView((binding.root))


        binding.btnNext.setOnClickListener(){
            val intent = Intent(this, SecondBird::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/564x/1f/19/fd/1f19fd96ac98022b660afc7502b610a1.jpg")
            .into(binding.imageView)
    }
}