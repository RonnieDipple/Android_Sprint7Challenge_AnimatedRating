package com.example.androiduserinterfacesprintchallenge.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.example.androiduserinterfacesprintchallenge.R

class CustomView (context: Context, attrs: AttributeSet?): LinearLayout(context, attrs ){

    init {


        val textView = LayoutInflater.from(context).inflate(R.layout.fragment_rating, this, false) as TextView
        textView.text = "test"

        addView(textView)
    }
}