package com.example.newsapp.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:url")
fun bindImageWithUrl(imageView: ImageView,
                     url: String){
    Glide.with(imageView)
        .load(url)
        .placeholder(com.google.android.material.R.drawable.abc_btn_radio_material)
        .into(imageView)
}