package com.bitc.app0108

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
  var fragment = listOf<Fragment>()

  override fun getItemCount(): Int {
    return fragment.size
  }

  override fun createFragment(position: Int): Fragment {
    return fragment.get(position)
  }
}










