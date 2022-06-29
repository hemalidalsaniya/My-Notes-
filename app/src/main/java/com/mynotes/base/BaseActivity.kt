package com.mynotes.base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mynotes.R
import java.util.logging.Handler

abstract class BaseActivity : AppCompatActivity() {

    fun loadActivity(className:Class<out BaseActivity>){
        startActivity(Intent(this,className))
    }

    fun loadFragment(fragment: Fragment,addTo:Boolean = false,addToBack:Boolean = false){
        supportFragmentManager.beginTransaction().apply {
            if(addTo) this.add(fragment,fragment.tag)
            else this.replace(R.id.placeHolder,fragment)
            if(addToBack) this.addToBackStack(fragment.tag)

        }.commit()
    }


}