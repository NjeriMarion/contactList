package com.marion.twitterclone

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
        displayTweets()
    }
    private fun displayTweets(){
        val tweet1 = TweetData("", "Marion", "+2542676374", "tyrhru@gmail.com")
        val tweet2 = TweetData("", "Mara", "07821234784", "Njeri@gmail.com")
        val tweet3 = TweetData("", "Ndemo", "+2542676374", "tyrhru@gmail.com")
        val tweet4 = TweetData("", "Veronica", "07821234784", "Njeri@gmail.com")
        val tweet5 = TweetData("", "Mmwangi", "+2542676374", "tyrhru@gmail.com")
        val tweet6 = TweetData("", "Kimani", "07821234784", "Njeri@gmail.com")
        val tweet7 = TweetData("", "Gorreti", "+2542676374", "tyrhru@gmail.com")
        val tweet8 = TweetData("", "Wambui", "07821234784", "Njeri@gmail.com")
        val tweet9 = TweetData("", "Nyaboke", "+2542676374", "tyrhru@gmail.com")
        val tweet10 = TweetData("", "Njeri", "07821234784", "Njeri@gmail.com")
        val tweet11 = TweetData("", "loice", "+2542676374", "tyrhru@gmail.com")
        val tweet12 = TweetData("", "kanini", "07821234784", "Njeri@gmail.com")
        val tweetList = listOf( tweet1, tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10,tweet11,tweet12)
        val tweetAdapter = TweetAdapter(tweetList)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = tweetAdapter
    }
}