package com.example.bigbasket

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target.SIZE_ORIGINAL


class ImageUtils{

    companion object{
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(view: ImageView,url: String){
            Glide.with(view.context).load(url).into(view)

        }

    }
}

