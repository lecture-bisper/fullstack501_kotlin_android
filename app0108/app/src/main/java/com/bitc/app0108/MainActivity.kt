package com.bitc.app0108

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.app0108.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnRecyclerView.setOnClickListener {
      val intent = Intent(this, RecyclerViewActivity::class.java)
      startActivity(intent)
    }

//    문제 1) 카카오톡 채팅방 리스트를 따라하는 리사이클러뷰를 작성하세요
//    # 리스트 목록은 5개
//    # 리스트에 표시될 데이터는 이름, 채팅 내용, 시간 (해당 데이터는 데이터 클래스 타입의 객체로 전달)
//    # 엑티비티 명 : ChatActivity.kt, activity_chat.xml
//    # 리사이클러뷰 항목 xml 명 : item_chat.xml
//    # ViewHolder 명 : ChatViewHolder
//    # Adapter 명 : ChatAdapter

    binding.btnRecyclerViewChat.setOnClickListener {
      val intent = Intent(this, ChatActivity::class.java)
      startActivity(intent)
    }

    binding.btnDrawerLayout.setOnClickListener {
      val intent = Intent(this, DrawerLayoutActivity::class.java)
      startActivity(intent)
    }

    binding.btnViewPager2.setOnClickListener {
      val intent = Intent(this, ViewPagerActivity::class.java)
      startActivity(intent)
    }
  }
}







