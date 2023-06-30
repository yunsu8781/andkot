package com.example.mycount

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mycount.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.countButton.setOnClickListener{
            count++
            binding.countView.text = "$count"
        }

        binding.resetButton.setOnClickListener{
            count = 0
            binding.countView.text = "$count"
        }



    }
}
