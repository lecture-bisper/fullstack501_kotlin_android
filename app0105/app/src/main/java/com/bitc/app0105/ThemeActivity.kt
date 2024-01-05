package com.bitc.app0105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.MenuItem.OnMenuItemClickListener

import android.widget.Toast
import androidx.appcompat.widget.SearchView

class ThemeActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_theme)


//    AndroidManifest.xml 의 activity 태그에 android:parentActivityName=".MainActivity"을 사용하지 않고 뒤로 가기 버튼을 출력
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
  }

//  액션바의 뒤로가기 버튼의 클릭 이벤트 함수
  override fun onSupportNavigateUp(): Boolean {
    Log.d("csy-backButton", "액션바의 뒤로가기 버튼 클릭!!")
    Toast.makeText(this, "액션바의 뒤로가기 버튼 클릭", Toast.LENGTH_SHORT).show()
    return super.onSupportNavigateUp()
  }

//  소스코드로 메뉴 추가하기
  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//    add() 메소드를 사용하여 메뉴 추가하기
//    val menuItem1: MenuItem? = menu?.add(0, 0, 0, "메뉴1")
//    val memuItem2: MenuItem? = menu?.add(0, 1, 0, "메뉴2")
    
//    xml 파일로 생성한 메뉴 화면을 현재 엑티비티의 메뉴에 추가함
    menuInflater.inflate(R.menu.menu_main, menu)

//    findItem(리소스ID) : 메뉴 xml 파일의 태그 중 지정한 id를 가지고 있는 태그를 검색하여 가져옴
    val menuItem1 = menu?.findItem(R.id.menu1)
    menuItem1?.setOnMenuItemClickListener {
      Log.d("csy-menu", "메뉴 1 클릭")
      Toast.makeText(this, "메뉴 1 클릭", Toast.LENGTH_SHORT).show()
      true
    }

    val menuItem4 = menu?.findItem(R.id.menu4)
    menuItem4?.setOnMenuItemClickListener(object: MenuItem.OnMenuItemClickListener {
      override fun onMenuItemClick(item: MenuItem): Boolean {
        Log.d("csy-menu", "메뉴 4 클릭")
        Toast.makeText(this@ThemeActivity, "메뉴 4 클릭", Toast.LENGTH_SHORT).show()
        return true
      }
    })

    var menuItem3 = menu?.findItem(R.id.menu3)
    val searchView = menuItem3?.actionView as SearchView
    searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(query: String?): Boolean {
        Log.d("csy-menu", "입력한 내용 : $query")
        return true
      }

      override fun onQueryTextChange(newText: String?): Boolean {
        Log.d("csy-menu", "입력 중인 내용 : $newText")
        return true
      }
    })

    return super.onCreateOptionsMenu(menu)
  }

//  메뉴 버튼 클릭 시 이벤트 처리
//  override fun onOptionsItemSelected(item: MenuItem): Boolean {
//    when (item.itemId) {
//      0 -> {
//        Log.d("csy-menu", "첫번째 메뉴 클릭")
//        Toast.makeText(this, "첫번째 메뉴 클릭", Toast.LENGTH_SHORT).show()
//        return true
//      }
//      1 -> {
//        Log.d("csy-menu", "두번째 메뉴 클릭")
//        Toast.makeText(this, "두번째 메뉴 클릭", Toast.LENGTH_SHORT).show()
//        return true
//      }
//      else -> {
//        return super.onOptionsItemSelected(item)
//      }
//    }
//  }
  
  

}










