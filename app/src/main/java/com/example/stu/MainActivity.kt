package com.example.stu

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)

        val  btn : Button = findViewById(R.id.btn)
        btn.setOnClickListener{
                Toast.makeText(this,"you click here",Toast.LENGTH_SHORT).show()
                //显式intent
                val intent = Intent(this,FirstActivity :: class.java)
                startActivity(intent)
                //隐式intent,action和category同时匹配时生效
                //val intent = Intent("com.example.stu.ACTION_START")
                //startActivity(intent)

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show()
        }
        return true
    }

    //随时随地退出程序
    object ActivityCollector {
        private val activities = ArrayList<Activity>()
        fun addActivity(activity: Activity) {
            activities.add(activity)
        }
        fun removeActivity(activity: Activity) {
            activities.remove(activity)
        }
        fun finishAll() {
            for (activity in activities) {
                if (!activity.isFinishing) {
                    activity.finish()
                }
            }
            activities.clear()
        }
    }


}


