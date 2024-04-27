package com.example.corotinesapicall

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter (private val context: Context, private var postList : ArrayList<PostModel>): RecyclerView.Adapter<PostAdapter.PostViewHolder>(){

  inner  class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      val id: TextView = itemView.findViewById(R.id.id_textView)
      val titlt: TextView = itemView.findViewById(R.id.title_textView)

    }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
   val layout = LayoutInflater.from(context).inflate(R.layout.each_row,parent,false)
    return PostViewHolder(layout)
  }

  override fun getItemCount(): Int {
   return postList.size
  }

  override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
      holder.id.text = postList[position].id.toString()
      holder.titlt.text = postList[position].title.toString()

//    val post = postList[position]
//    val id :TextView = holder.itemView.findViewById<TextView?>(R.id.id_textView)
//    val title :TextView = holder.itemView.findViewById(R.id.title_textView)
  }

    fun setData( postList : ArrayList<PostModel>){
        this.postList= postList
        notifyDataSetChanged()

    }

}