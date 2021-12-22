package com.example.blogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        val recyclerView:RecyclerView=findViewById(R.id.recylerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val titleList=ArrayList<String>()
        val desList=ArrayList<String>()
        val authList=ArrayList<String>()

for(i in 0 until 100){
titleList.add("Title $i")
desList.add("Des $i")
authList.add("Author $i")
        }
val adapter:PostAdapter=PostAdapter(titleList,desList,authList)
        recyclerView.adapter=adapter
    }
}