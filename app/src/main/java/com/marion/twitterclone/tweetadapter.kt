package com.marion.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.marion.twitterclone.databinding.ActivityMainBinding
import com.marion.twitterclone.databinding.TweetlistitemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

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
        binding.tvcommentcount.text = currentTweet.commentCount
        binding.tvrtCount.text = currentTweet.rtCount
        Picasso
            .get()
            .load(currentTweet.avatar)
//            .resize(80, 80)
//            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.imageView)
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class Tweetviewholder(var binding: TweetlistitemBinding): ViewHolder(binding.root)