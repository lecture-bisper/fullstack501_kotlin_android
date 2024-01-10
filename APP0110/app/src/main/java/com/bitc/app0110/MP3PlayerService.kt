package com.bitc.app0110

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder
import android.widget.Toast

class MP3PlayerService : Service() {

  var mediaPlayer: MediaPlayer? = null

  var mp3PlayerBinder: MP3PlayerBinder = MP3PlayerBinder()

  inner class MP3PlayerBinder: Binder() {
    fun getService() : MP3PlayerService {
      return this@MP3PlayerService
    }
  }

  override fun onBind(intent: Intent): IBinder {
    return mp3PlayerBinder
  }

  fun play() {
    if (mediaPlayer == null) {
      mediaPlayer = MediaPlayer.create(this, R.raw.chocolate)
      mediaPlayer?.setVolume(1.0f, 1.0f)
      mediaPlayer?.isLooping = true
      mediaPlayer?.start()
    }
    else {
      if (mediaPlayer!!.isPlaying) {
        Toast.makeText(this, "이미 음악이 재생중입니다.", Toast.LENGTH_SHORT).show()
      }
      else {
        mediaPlayer?.start()
      }
    }
  }

  fun stop() {
    mediaPlayer?.let {
      if (it.isPlaying) {
        it.stop()
        it.release()
        mediaPlayer = null
      }
    }
  }

  fun pause() {
    mediaPlayer?.let {
      if (it.isPlaying) {
        it.pause()
      }
    }
  }
}









