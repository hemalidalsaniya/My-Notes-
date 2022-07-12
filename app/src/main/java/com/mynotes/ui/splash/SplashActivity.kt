package com.mynotes.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mynotes.base.BaseActivity
import com.mynotes.databinding.ActivitySplashBinding
import com.mynotes.ui.home.HomeActivity
import com.mynotes.ui.splash.fragment.FourthFragment
import com.mynotes.ui.splash.fragment.HomeFragment
import com.mynotes.ui.splash.fragment.SecondFragment
import com.mynotes.ui.splash.fragment.ThirdFragment

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    private var splashActivityBinding: ActivitySplashBinding? = null
    private val binding get() = splashActivityBinding!!
    private val fragmentList = ArrayList<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashActivityBinding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Looper.myLooper()?.let {
//            Handler(it).postDelayed({
//                loadActivity(HomeActivity::class.java)
//                finish()
//            },1500)
//        }

        setFragment()

        loadFragment(HomeFragment())
        val pagerAdapter = SplashViewPagerAdapter(this, fragmentList)
        binding.pager.adapter = pagerAdapter
        binding.apply {
            dots.setViewPager2(pager)
        }
    }

    private fun setFragment() {
        fragmentList.apply {
            add(HomeFragment())
            add(SecondFragment())
            add(ThirdFragment())
            add(FourthFragment())
        }
    }
}