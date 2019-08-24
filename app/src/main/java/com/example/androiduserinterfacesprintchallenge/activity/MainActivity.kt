package com.example.androiduserinterfacesprintchallenge.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import com.example.androiduserinterfacesprintchallenge.R
import com.example.androiduserinterfacesprintchallenge.fragment.RatingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


        btn_add.setOnClickListener {
           val myFragment = RatingFragment()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragment_holder, myFragment)
            transaction.addToBackStack(null)
            transaction.commit()



        }
    }


}
