package com.example.imo_app_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo_app_ui.adpter.ChatAdapterDark
import com.example.imo_app_ui.adpter.ChatAdpter
import com.example.imo_app_ui.model.Chat

class DarkModeActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dark_mode)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.chat_dark_mode_recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(getAllChats())
    }
    fun refreshAdapter(chats:ArrayList<Chat>){
        val adapter = ChatAdapterDark(chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{
        val chats:ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(R.drawable.im_men3,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men2,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men2,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men3,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men2,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men,"Rahmatullayev Tohir",2))
        chats.add(Chat(R.drawable.im_men3,"Rahmatullayev Tohir",2))
        return chats
    }
}