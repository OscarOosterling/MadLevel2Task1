package com.example.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.Placeholder
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter(private val places: List<Place>):RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){

    inner class ViewHolder(placeView : View):RecyclerView.ViewHolder(placeView){
        val placeList = arrayListOf<Place>()
        val binding = ItemPlaceBinding.bind(placeView)
        fun databind(place:Place){
            binding.textView.text = place.name
            binding.imageView.setImageResource(place.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_place,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(places[position])
    }

    override fun getItemCount(): Int {
        return places.size
    }
}