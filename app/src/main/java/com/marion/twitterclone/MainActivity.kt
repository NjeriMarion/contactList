package com.marion.twitterclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.marion.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonContact.setOnClickListener {
            val intent = Intent(this, AddContact::class.java)
            startActivity(intent)
        }
        displayTweets()

    }
    private fun displayTweets(){
        val cont1 = TweetData("https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60", "Marion", "+2542676374", "tyrhru@gmail.com")
        val cont2 = TweetData("https://images.unsplash.com/photo-1471898554234-bcbfedd35134?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Mara", "07821234784", "Njeri@gmail.com")
        val cont3 = TweetData("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60", "Ndemo", "+2542676374", "tyrhru@gmail.com")
        val cont4 = TweetData("https://images.unsplash.com/photo-1619895862022-09114b41f16f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60", "Veronica", "07821234784", "Njeri@gmail.com")
        val cont5 = TweetData("https://images.unsplash.com/photo-1607746882042-944635dfe10e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Mwangi", "+2542676374", "tyrhru@gmail.com")
        val cont6 = TweetData("https://images.unsplash.com/photo-1614289371518-722f2615943d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Kimani", "07821234784", "Njeri@gmail.com")
        val cont7 = TweetData("https://images.unsplash.com/photo-1521252659862-eec69941b071?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Gorreti", "+2542676374", "tyrhru@gmail.com")
        val cont8 = TweetData("https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Wambui", "07821234784", "Njeri@gmail.com")
        val cont9 = TweetData("https://images.unsplash.com/photo-1543610892-0b1f7e6d8ac1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Nyaboke", "+2542676374", "tyrhru@gmail.com")
        val cont10 = TweetData("https://images.unsplash.com/photo-1532074205216-d0e1f4b87368?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDF8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60", "Njeri", "07821234784", "Njeri@gmail.com")
        val cont11 = TweetData("https://images.unsplash.com/photo-1495462911434-be47104d70fa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDExfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60", "loice", "+2542676374", "tyrhru@gmail.com")
        val cont12 = TweetData("https://images.unsplash.com/photo-1495462911434-be47104d70fa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDExfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60", "kanini", "07821234784", "Njeri@gmail.com")
        val cont13 = TweetData("https://images.unsplash.com/photo-1495462911434-be47104d70fa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDExfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60", "loice", "+2542676374", "tyrhru@gmail.com")
        val cont14 = TweetData("https://images.unsplash.com/photo-1495462911434-be47104d70fa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDExfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60", "kanini", "07821234784", "Njeri@gmail.com")
        val contactList = mutableListOf<TweetData>( cont1, cont2,cont3,cont4,cont5, cont6, cont7, cont8, cont9, cont10, cont11, cont12, cont13,cont14)
        val contactAdapter = TweetAdapter(contactList)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = contactAdapter
    }
}