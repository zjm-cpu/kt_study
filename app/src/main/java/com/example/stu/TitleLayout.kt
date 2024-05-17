package com.example.stu

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class TitleLayout (context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        val titleBack : Button = findViewById(R.id.titleBack)
        val titleMenu : Button = findViewById(R.id.titleMenu)
        titleBack.setOnClickListener {
            //as强制类型转换
            val activity = context as Activity
            activity.finish()
        }
        titleMenu.setOnClickListener {
            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }
}