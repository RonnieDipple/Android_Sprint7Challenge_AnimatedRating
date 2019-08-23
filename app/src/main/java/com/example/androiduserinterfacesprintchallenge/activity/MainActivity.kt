package com.example.androiduserinterfacesprintchallenge.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import com.example.androiduserinterfacesprintchallenge.R
import com.example.androiduserinterfacesprintchallenge.RatingFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_rating.*

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


        btn_add.setOnClickListener {
            if (fragment_holder!=null){
            showFragment()
            }



        }
    }

    private fun showFragment(){


        val fragment = RatingFragment()
        fragment.enterTransition = Explode()
        fragment.exitTransition = Explode()
        manager.beginTransaction()
            .replace(R.id.fragment_holder, fragment)
            .commit()



    }
}
