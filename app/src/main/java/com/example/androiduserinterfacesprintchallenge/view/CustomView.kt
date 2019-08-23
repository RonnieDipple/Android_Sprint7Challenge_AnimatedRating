package com.example.androiduserinterfacesprintchallenge.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import com.example.androiduserinterfacesprintchallenge.R

class CustomView (context: Context, attrs: AttributeSet?): LinearLayout(context, attrs ){

    init {
      val editText = EditText(context)
        editText.layoutParams
        addView(editText)
    }
}