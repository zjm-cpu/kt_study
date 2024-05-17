package com.example.stu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stu.adapter.FruitAdapter
import com.example.stu.entity.Fruit

class ListView : AppCompatActivity() {
//    private val fruitList = ArrayList<Fruit>()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContentView(R.layout.activity_list_view)
//        val listView: ListView = findViewById(R.id.listView)
//        initFruits()
//
//        //第三个参数指定成false，表示只让我们在父布局中声明的layout属性生效，但不会为这个View添加父布局
//        val adapter = FruitAdapter(this,  R.layout.fruit_item, fruitList)
//        listView.adapter = adapter
//        listView.setOnItemClickListener { _, _, position, _ ->
//            val fruit = fruitList[position]
//            Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
//        }
//
//    }
//
//
//    private fun initFruits() {
//        repeat(2) {
//            fruitList.add(Fruit("Apple", R.drawable.apple_pic))
//            fruitList.add(Fruit("Banana", R.drawable.banana_pic))
//            fruitList.add(Fruit("Orange", R.drawable.orange_pic))
//            fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
//            fruitList.add(Fruit("Pear", R.drawable.pear_pic))
//            fruitList.add(Fruit("Grape", R.drawable.grape_pic))
//            fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
//            fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
//            fruitList.add(Fruit("Cherry", R.drawable.cherry_pic))
//            fruitList.add(Fruit("Mango", R.drawable.mango_pic))
//        }
//    }

    private val fruitList = ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        initFruits() // 初始化水果数据
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerView.adapter = adapter
    }
    private fun initFruits() {
        repeat(2) {
            fruitList.add(Fruit("Apple", R.drawable.apple_pic))
            fruitList.add(Fruit("Banana", R.drawable.banana_pic))
            fruitList.add(Fruit("Orange", R.drawable.orange_pic))
            fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
            fruitList.add(Fruit("Pear", R.drawable.pear_pic))
            fruitList.add(Fruit("Grape", R.drawable.grape_pic))
            fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
            fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
            fruitList.add(Fruit("Cherry", R.drawable.cherry_pic))
            fruitList.add(Fruit("Mango", R.drawable.mango_pic))
        }
    }
}