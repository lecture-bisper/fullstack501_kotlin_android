package com.bitc.app0108

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bitc.app0108.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityViewPagerBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val fragmentList = listOf<Fragment>(OneFragment(), TwoFragment(), ThreeFragment())
    val adapter = ViewPager2Adapter(this)

    adapter.fragment = fragmentList
    binding.viewPager2.adapter = adapter
  }
}
