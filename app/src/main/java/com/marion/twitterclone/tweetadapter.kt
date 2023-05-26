package com.marion.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.marion.twitterclone.databinding.ActivityMainBinding
import com.marion.twitterclone.databinding.TweetlistitemBinding

class TweetAdapter (var tweetList : List<TweetData>):RecyclerView.Adapter<Tweetviewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Tweetviewholder {
        val binding =
            TweetlistitemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false)
        return Tweetviewholder(binding)
    }

    override fun onBindViewHolder(holder: Tweetviewholder, position: Int) {
        val currentTweet = tweetList.get(position)
        val binding = holder.binding
        binding.tvDisplayName.text = currentTweet.displayName
        binding.tvcommentcount.text = currentTweet.commentCount.toString()
        binding.tvrtCount.text = currentTweet.rtCount.toString()
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class Tweetviewholder(var binding: TweetlistitemBinding): ViewHolder(binding.root)