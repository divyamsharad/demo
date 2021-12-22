package com.example.blogapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class PostAdapter(private val titleList:ArrayList<String>,
                  private val descList:ArrayList<String>,
                  private val authList:ArrayList<String>):RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    inner class PostViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val title:TextView=view.findViewById(R.id.textView2)
        val desc:TextView=view.findViewById(R.id.textView5)
        val author:TextView=view.findViewById(R.id.textView6)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent ,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.title.text=titleList[position]
        holder.desc.text=descList[position]
        holder.author.text=authList[position]
    }

    override fun getItemCount(): Int {
        return titleList.size
    }
}