package com.example.stu.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.stu.R
import com.example.stu.entity.Fruit
import java.text.FieldPosition

//listview适配器
//class FruitAdapter(activity: Activity, val resourceId : Int , data: List<Fruit>) :
//    ArrayAdapter<Fruit>(activity,resourceId,data) {
//    inner class ViewHolder(val fruitImage: ImageView, val fruitName: TextView)
//    override fun getView(position: Int,convertView: View?,parent: ViewGroup): View {
//
//        val view : View
//        val viewholder : ViewHolder
//        if (convertView == null){
//            view = LayoutInflater.from(context).inflate(resourceId,parent,false)
//            val fruitImage : ImageView = view.findViewById(R.id.fruitImage)
//            val fruitName : TextView = view.findViewById(R.id.fruitName)
//            viewholder = ViewHolder(fruitImage,fruitName)
//            view.tag = viewholder
//        }else{
//            view = convertView
//            viewholder =    view.tag as ViewHolder
//        }
//        val fruit = getItem(position)
//        if (fruit != null){
//           viewholder.fruitImage.setImageResource(fruit.imageId)
//            viewholder.fruitName.text = fruit.name
//        }
//    return view
//    }
//}
class FruitAdapter(val fruitList: List<Fruit>) :
    RecyclerView.Adapter<FruitAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fruitImage: ImageView = view.findViewById(R.id.fruitImage)
        val fruitName: TextView = view.findViewById(R.id.fruitName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //可以进行fruit_item更换适用于不同布局
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fruit_item, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            val fruit = fruitList[position]
            Toast.makeText(parent.context, "you clicked view ${fruit.name}",
                Toast.LENGTH_SHORT).show()
        }
        viewHolder.fruitImage.setOnClickListener {
            val position = viewHolder.adapterPosition
            val fruit = fruitList[position]
            Toast.makeText(parent.context, "you clicked image ${fruit.name}",
                Toast.LENGTH_SHORT).show()
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name
    }
    override fun getItemCount() = fruitList.size
}