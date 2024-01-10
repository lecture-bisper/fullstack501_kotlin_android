package com.bitc.app0109

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.app0109.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    eventInit()
  }

  private fun eventInit() {
    binding.btnReceiver.setOnClickListener {
      val receiverIntent = Intent(this, ReceiverActivity::class.java)
      startActivity(receiverIntent)
    }

    binding.btnService.setOnClickListener {
      val serviceIntent = Intent(this, ServiceActivity::class.java)
      startActivity(serviceIntent)
    }
  }
}
