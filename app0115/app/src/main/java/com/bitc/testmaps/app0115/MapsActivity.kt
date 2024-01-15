package com.bitc.testmaps.app0115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.testmaps.app0115.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityMapsBinding.inflate(layoutInflater)
    setContentView(binding.root)

//    binding.mapView.start(object : MapLifeCycleCallback() {
//      override fun onMapDestroy() {
//        // 지도 API 가 정상적으로 종료될 때 호출됨
//      }
//
//      override fun onMapError(error: Exception?) {
//        // 인증 실패 및 지도 사용 중 에러가 발생할 때 호출됨
//      }
//    }, object : KakaoMapReadyCallback() {
//      override fun onMapReady(kakaoMap: KakaoMap?) {
//        // 인증 후 API 가 정상적으로 실행될 때 호출됨
//      }
//    })
  }
}
