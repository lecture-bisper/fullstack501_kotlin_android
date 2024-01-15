package com.bitc.testmaps.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.testmaps.testapp.databinding.ActivityMainBinding
import com.naver.maps.map.NaverMapSdk

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    NaverMapSdk.getInstance(this).client =
      NaverMapSdk.NaverCloudPlatformClient("1ebv73n8eh")
  }
}
