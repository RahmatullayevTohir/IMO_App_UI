package com.example.imo_app_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo_app_ui.adpter.ChatAdpter
import com.example.imo_app_ui.model.Chat

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.chat_recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)


        refreshAdapter(getAllChats())
    }
    fun refreshAdapter(chats:ArrayList<Chat>){
        val adapter = ChatAdpter(this,chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{
        val chats:ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(R.drawable.im_men,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men2,"Rahmatullayev Akmal",5))
        chats.add(Chat(R.drawable.im_men3,"Xolmatov Sarvar",8))
        chats.add(Chat(R.drawable.im_men2,"Jo'rabekov Sherzod",0))
        chats.add(Chat(R.drawable.im_men3,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men3,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men2,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men2,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men3,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men3,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men3,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men3,"Suyunov Nodir",9))
        chats.add(Chat(R.drawable.im_men3,"Suyunov Nodir",9))

        return chats
    }
}