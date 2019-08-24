package com.example.androiduserinterfacesprintchallenge.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatEditText
import com.example.androiduserinterfacesprintchallenge.R


class CustomView : AppCompatEditText{

    private val starOn = R.drawable.ic_star_golden_24dp
    private val starOff = R.drawable.ic_star_off_golden_24dp
    private val starHalf = R.drawable.ic_star_half_24dp



    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr

    )

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        if (!isEnabled){
            return false
        }

        when(event?.action){

            MotionEvent.ACTION_DOWN ->{

            }



        }
        return super.onTouchEvent(event)
    }


}