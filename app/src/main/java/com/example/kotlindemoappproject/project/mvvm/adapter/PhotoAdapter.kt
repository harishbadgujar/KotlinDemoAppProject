package com.example.kotlindemoappproject.project.mvvm.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kotlindemoappproject.R
import com.example.kotlindemoappproject.project.mvvm.modal.PhotoModal

class PhotoAdapter(private var photoList : List<PhotoModal>,private val context: Context):
RecyclerView.Adapter<PhotoAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.photo_new_row,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val datamodal = photoList.get(position)

        Log.d("titleData123",datamodal.thumbnailUrl)

        holder.title.text = datamodal.title

        holder.bind(photoList[position])

    }

    override fun getItemCount(): Int {

        return photoList.size
    }

    fun addPhotos(photodataList: List<PhotoModal>){

        this.photoList = photodataList
        notifyDataSetChanged()

    }

    class ViewHolder(itemLayoutView: View): RecyclerView.ViewHolder(itemLayoutView)  {


        var title : TextView
        var ivImage : ImageView


        init {
            title = itemLayoutView.findViewById(R.id.titles)
            ivImage = itemLayoutView.findViewById(R.id.imageV)
        }


        fun bind(photoModal: PhotoModal) {
            ivImage.load(photoModal.thumbnailUrl) {
                placeholder(R.drawable.ic_launcher_background)
            }
        }
    }
}


