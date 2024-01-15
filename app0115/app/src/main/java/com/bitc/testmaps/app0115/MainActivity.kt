package com.bitc.testmaps.app0115

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitc.testmaps.app0115.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnMaps.setOnClickListener {
      val intent = Intent(this, MapsActivity::class.java)
      startActivity(intent)
    }

    binding.btnNaverMap.setOnClickListener {
      val intent = Intent(this, NaverMapActivity::class.java)
      startActivity(intent)
    }
//    val mapView: MapView = binding.mapView
//    mapView.start(object : MapLifeCycleCallback() {
//      fun onMapDestroy() {
//        // 지도 API 가 정상적으로 종료될 때 호출됨
//      }
//
//      fun onMapError(error: Exception?) {
//        // 인증 실패 및 지도 사용 중 에러가 발생할 때 호출됨
//      }
//    }, object : KakaoMapReadyCallback() {
//      fun onMapReady(kakaoMap: KakaoMap?) {
//        // 인증 후 API 가 정상적으로 실행될 때 호출됨
//      }
//    })
  }
}
