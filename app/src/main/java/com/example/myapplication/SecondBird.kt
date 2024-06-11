package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBird : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener{
            val intent = Intent(this,ActivityMainBinding::class.java)
            finish()
        }

        binding.btnNext.setOnClickListener() {
            val intent = Intent(this,thirdBird::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/564x/18/8b/88/188b888db4ab49cdfd0de3fa8051ac3b.jpg")
            .into(binding.imageView2)
    }
}





