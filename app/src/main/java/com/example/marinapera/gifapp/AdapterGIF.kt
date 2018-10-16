package com.example.marinapera.gifapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

class AdapterGIF(val context: Context) : RecyclerView.Adapter<AdapterGIF.ViewHolder>() {
    val list = arrayListOf<String>("https://media.giphy.com/media/3o7btQdOa4wOH8U7RK/giphy.gif",
    "https://media.giphy.com/media/xTiTnF6v2Th2GPmZ7q/giphy.gif",
    "https://media.giphy.com/media/26uf74lvsfLSt70Vq/giphy.gif",
    "https://media.giphy.com/media/l0MYBgf2A2INoz22Q/giphy.gif",
    "https://media.giphy.com/media/xUPGcp084aN0TS7XdC/giphy.gif",
    "https://media.giphy.com/media/42D3CxaINsAFemFuId/giphy.gif",
    "https://media.giphy.com/media/fWgAW7WZtPMBjmpa3V/giphy.gif",
    "https://media.giphy.com/media/3ohc14iHLNhwhkOdbi/giphy.gif",
    "https://media.giphy.com/media/65TfDzMhtczC84Y2tS/giphy.gif",
    "https://media.giphy.com/media/3ohc11QmY3y8K0RFQI/giphy.gif",
    "https://media.giphy.com/media/xUOwFVEiYjingozuqk/giphy.gif",
    "https://media.giphy.com/media/xUOrwbGjODhnRe0ZTW/giphy.gif",
    "https://media.giphy.com/media/9xjTEV1yiiCtsnNsgz/giphy.gif",
    "https://media.giphy.com/media/8w0FfEpbp4hrAntLDX/giphy.gif")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder{
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.gifs_row, p0, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        Glide.with(context)
                .load(list[p1])
                .into(p0.imageView1)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView1: ImageView = itemView.findViewById(R.id.gif_image1)
    }
}