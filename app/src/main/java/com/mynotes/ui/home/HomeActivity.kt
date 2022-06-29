package com.mynotes.ui.home

import android.os.Bundle
import com.mynotes.base.BaseActivity
import com.mynotes.databinding.ActivityHomeBinding
import com.mynotes.ui.home.fragment.HomeFragment

class HomeActivity : BaseActivity() {

    private var _binding : ActivityHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(HomeFragment())

    }
}