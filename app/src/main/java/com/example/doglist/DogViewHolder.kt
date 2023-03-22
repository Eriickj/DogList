package com.example.doglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.doglist.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)
    fun bind (images:String){
        Picasso.get().load(images).into(binding.ivDog)

    }
}