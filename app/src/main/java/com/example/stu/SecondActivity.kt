package com.example.stu

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var count = 0
        setContentView(R.layout.activity_second)
        val btn4 : Button = findViewById(R.id.btn4)
        val btn5 : Button = findViewById(R.id.btn5)
        val btn6 : Button = findViewById(R.id.btn6)
        val btn7 : Button = findViewById(R.id.btn7)
        val edit_text : EditText = findViewById(R.id.edit_text)
        val imageView : ImageView = findViewById(R.id.image)
        val progressBar : ProgressBar = findViewById(R.id.progressBar)
        btn4.setOnClickListener{
            AlertDialog.Builder(this).apply {
                setTitle("This is Dialog")
                setMessage("exit!!!")
                //可否使用Back键关闭对话框等
                //setCancelable(false)
                setPositiveButton("OK") { dialog, which ->
                    MainActivity.ActivityCollector.finishAll()
                }
                setNegativeButton("Cancel") { dialog, which ->
                }
                show()

        }
    }
        btn5.setOnClickListener{
            if(count % 2 == 0)
                imageView.setImageResource(R.drawable.img2)
            else
                imageView.setImageResource(R.drawable.img1)
            count++
        }
        btn6.setOnClickListener{
            if (progressBar.visibility == View.VISIBLE) {
                progressBar.visibility = View.GONE
            } else {
                progressBar.visibility = View.VISIBLE
            }
        }
        btn7.setOnClickListener{

            val inputText = edit_text.text.toString()
            Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
        }

}
}