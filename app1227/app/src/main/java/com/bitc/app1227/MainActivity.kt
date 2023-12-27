package com.bitc.app1227

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

// 소스코드로 UI 작성
class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)

    val title = TextView(this).apply {
      text = "MainActivity"
    }

//    TextView 클래스를 사용하여 텍스트 박스 UI 생성
    val name = TextView(this).apply { 
      typeface = Typeface.DEFAULT_BOLD
//      TextVive에 들어갈 글자 설정
      text = "고양이"
    }

//    ImageView 클래스를 사용하여 이미지 박스 UI를 생성
    val image = ImageView(this).also {
//      리소스 폴더 안에 있는 cat02 이미지 파일을 가져옴
      it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cat02))
    }

    val address = TextView(this).apply {
      typeface = Typeface.DEFAULT_BOLD
      text = "새끼 고양이 두마리"
    }

//    안드로이드 기본 UI 패널인 LinearLayout 생성
    val layout = LinearLayout(this).apply {
//      가로/세로 정렬 방식 설정
      orientation = LinearLayout.VERTICAL
//      컨텐츠 존재 위치 설정
      gravity = Gravity.CENTER
//      UI 패널에 위에서 생성한 View 클래스의 객체를 추가함
      addView(title, WRAP_CONTENT, WRAP_CONTENT)
      addView(name, WRAP_CONTENT, WRAP_CONTENT)
      addView(image, WRAP_CONTENT, WRAP_CONTENT)
      addView(address, WRAP_CONTENT, WRAP_CONTENT)
    }

//    설정된 layout 내용을 화면에 출력
    setContentView(layout)
  }
}
