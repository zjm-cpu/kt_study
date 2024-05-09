package com.example.stu

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity", javaClass.simpleName)
        MainActivity.ActivityCollector.addActivity(this)
    }
    override fun onDestroy() {
        super.onDestroy()
        MainActivity.ActivityCollector.removeActivity(this)
    }
}