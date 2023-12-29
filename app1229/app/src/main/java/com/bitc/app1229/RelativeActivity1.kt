package com.bitc.app1229

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.app1229.databinding.ActivityRelative1Binding

class RelativeActivity1 : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityRelative1Binding.inflate(layoutInflater)
    setContentView(binding.root)
  }
}
