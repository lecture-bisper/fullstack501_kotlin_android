package com.bitc.app0110

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import com.bitc.app0110.databinding.ActivityMainBinding
import com.bitc.app0110.databinding.ActivityMp3Binding

class MP3Activity : AppCompatActivity() {

  var mp3PlayerService: MP3PlayerService? = null

  val mp3PlayerServiceConnection: ServiceConnection = object : ServiceConnection {
    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
      mp3PlayerService = (service as MP3PlayerService.MP3PlayerBinder).getService()
    }

    override fun onServiceDisconnected(name: ComponentName?) {

    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityMp3Binding.inflate(layoutInflater)
    setContentView(binding.root)

    if (mp3PlayerService == null) {
      val intent = Intent(this, MP3PlayerService::class.java)
      bindService(intent, mp3PlayerServiceConnection, Context.BIND_AUTO_CREATE)
    }

    binding.btnMp3Play.setOnClickListener {
      mp3PlayerService?.play()
    }

    binding.btnMp3Stop.setOnClickListener {
      mp3PlayerService?.stop()
    }

    binding.btnMp3Pause.setOnClickListener {
      mp3PlayerService?.pause()
    }
  }
}
