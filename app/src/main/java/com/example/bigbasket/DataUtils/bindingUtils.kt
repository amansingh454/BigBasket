package com.example.bigbasket

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


class ImageUtils{

    companion object{
        @JvmStatic
        @BindingAdapter("image")
        fun loadImage(view:ImageView,url:String){
            Glide.with(view).load(url).into(view)

        }

    }
}

