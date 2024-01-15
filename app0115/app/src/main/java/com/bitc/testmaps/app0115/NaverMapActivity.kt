package com.bitc.testmaps.app0115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.testmaps.app0115.databinding.ActivityNaverMapBinding
import com.naver.maps.map.NaverMapSdk

class NaverMapActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityNaverMapBinding.inflate(layoutInflater)
    setContentView(binding.root)

//    네이버 지도 API 를 초기화
    NaverMapSdk.getInstance(this).client =
      NaverMapSdk.NaverCloudPlatformClient("1ebv73n8eh")
  }
}
