package com.mynotes.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mynotes.base.BaseActivity
import com.mynotes.databinding.ActivityHomeBinding
import com.mynotes.ui.splash.fragment.FourthFragment
import com.mynotes.ui.splash.fragment.HomeFragment
import com.mynotes.ui.splash.fragment.SecondFragment
import com.mynotes.ui.splash.fragment.ThirdFragment
import com.mynotes.ui.splash.SplashViewPagerAdapter


class HomeActivity : BaseActivity() {

    private var _binding: ActivityHomeBinding?=null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(HomeFragment())

    }


}