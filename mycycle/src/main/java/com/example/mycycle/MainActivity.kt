package com.example.mycycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.mycycle.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


    }

    override fun onStart() {
        super.onStart()
        Log.d("MyActivity", "onStart")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MyActivity", "onStop")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MyActivity", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MyActivity", "onPause")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyActivity", "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MyActivity", "onRestart")
    }
}
