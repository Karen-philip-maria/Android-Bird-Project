package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.example.myapplication.databinding.ActivityFourthBirdBinding
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class fifthBird : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView((binding.root))


        binding.btnBack.setOnClickListener(){
            val intent = Intent(this, fourthBird::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/736x/05/b8/13/05b8139f98240e5674816ac14dac4751.jpg")
            .into(binding.imageView7)
    }
}