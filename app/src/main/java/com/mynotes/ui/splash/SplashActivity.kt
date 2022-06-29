package com.mynotes.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import com.mynotes.base.BaseActivity
import com.mynotes.databinding.ActivitySplashBinding
import com.mynotes.ui.home.HomeActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    private var splashActivityBinding : ActivitySplashBinding? = null
    private val binding get() = splashActivityBinding!!

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        splashActivityBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Looper.myLooper()?.let {
            Handler(it).postDelayed({
                loadActivity(HomeActivity::class.java)
                finish()
            },1500)
        }

    }

}