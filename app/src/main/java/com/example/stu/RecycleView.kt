package com.example.stu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.stu.adapter.FruitAdapter
import com.example.stu.entity.Fruit

class RecycleView : AppCompatActivity() {
    private val fruitList = ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        initFruits() // 初始化水果数据
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        //瀑布流布局效果
        val layoutManager = StaggeredGridLayoutManager(3,
            StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerView.adapter = adapter
    }
    private fun initFruits() {
        repeat(5) {
            fruitList.add(Fruit(getRandomLengthString("Apple"),
                R.drawable.apple_pic))
            fruitList.add(Fruit(getRandomLengthString("Banana"),
                R.drawable.banana_pic))
            fruitList.add(Fruit(getRandomLengthString("Orange"),
                R.drawable.orange_pic))
            fruitList.add(Fruit(getRandomLengthString("Watermelon"),
                R.drawable.watermelon_pic))
            fruitList.add(Fruit(getRandomLengthString("Pear"),
                R.drawable.pear_pic))
            fruitList.add(Fruit(getRandomLengthString("Grape"),
                R.drawable.grape_pic))
            fruitList.add(Fruit(getRandomLengthString("Pineapple"),
                R.drawable.pineapple_pic))
            fruitList.add(Fruit(getRandomLengthString("Strawberry"),
                R.drawable.strawberry_pic))
            fruitList.add(Fruit(getRandomLengthString("Cherry"),
                R.drawable.cherry_pic))
            fruitList.add(Fruit(getRandomLengthString("Mango"),
                R.drawable.mango_pic))
        }
    }
    private fun getRandomLengthString(str: String): String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(5) {
            builder.append(str)
        }
        return builder.toString()
    }
}