package com.example.myword

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acyivity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = getWord()
    }

    private fun getWord(): String {
        val list = listOf(
            "istj",
            "istp",
            "infj",
            "intj",
            "isfj",
            "isfp",
            "infp",
            "intp",
            "estj",
            "esfp",
            "enfp",
            "entp",
            "esfj",
            "esfj",
            "estp",
            "enfj",
            "entj"
        )
        return list.random()
    }
}

