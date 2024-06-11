package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFourthBirdBinding
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySecondBirdBinding
import com.example.myapplication.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class fourthBird : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener{
            val intent = Intent(this, thirdBird::class.java)
            finish()
        }

        binding.btnNext.setOnClickListener() {
            val intent = Intent(this,fifthBird::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/564x/be/d2/aa/bed2aa681a8f26e7d446be0793555140.jpg")
            .into(binding.imageView4)
    }
}
