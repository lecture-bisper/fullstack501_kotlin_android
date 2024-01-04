package com.bitc.app0104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.app0104.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnCustom.setOnClickListener {
      val intent = Intent(this, AlertDialogActivity::class.java)
      startActivity(intent)
    }

    binding.btnAlarm.setOnClickListener {
      val intent = Intent(this, AlarmActivity::class.java)
      startActivity(intent)
    }
  }
}
