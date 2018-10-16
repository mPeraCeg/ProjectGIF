package com.example.marinapera.gifapp

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_trending_gifs.*

class TrendingGIFs : Activity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending_gifs)

        rvGIFs.layoutManager = GridLayoutManager(this, 2)
        rvGIFs.adapter = AdapterGIF(this)
    }
}
