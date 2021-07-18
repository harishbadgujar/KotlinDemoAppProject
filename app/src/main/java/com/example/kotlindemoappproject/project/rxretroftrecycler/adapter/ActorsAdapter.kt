package com.example.kotlindemoappproject.project.rxretroftrecycler.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlindemoappproject.R
import com.example.kotlindemoappproject.project.rxretroftrecycler.modal.ActorsModal

class ActorsAdapter(
    private
    var dataList: List<ActorsModal>, private val context: Context
) : RecyclerView.Adapter<ActorsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.actors_row, parent, false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList.get(position)
        //  holder.titleTextView.text = dataModel.title
        holder.title.text = dataModel.url

        Log.d("actorsList101", dataModel.title)
        Log.d("actorsList102", dataModel.url)

       /* holder.ivImage.load(dataModel.url) {
            placeholder(R.drawable.ic_placeholder)
        }*/

       /* Glide.with(context)
            .load(dataModel.url)
            .into(holder.ivImage)*/
    }

    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {

       // var titleTextView: TextView
        var title: TextView
        var ivImage: ImageView

        init {
          //  titleTextView = itemLayoutView.findViewById(R.id.name)
            ivImage = itemLayoutView.findViewById(R.id.image)
            title = itemLayoutView.findViewById(R.id.url)
        }
    }

}