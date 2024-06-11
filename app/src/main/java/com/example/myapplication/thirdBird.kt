package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class thirdBird : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener{
            val intent = Intent(this, thirdBird::class.java)
            finish()
        }

        binding.btnNext.setOnClickListener() {
            val intent = Intent(this,fourthBird::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/564x/34/53/a1/3453a1fa029799d9f81685520b722651.jpg")
            .into(binding.imageView2)
    }
}