package com.bitc.app0109

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log

class TimeService : Service() {

  override fun onBind(intent: Intent): IBinder {
    return Binder()
  }

  override fun onCreate() {
    super.onCreate()
    Log.d("csy-service", "서비스 시작")
  }

  override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
    Log.d("csy-service", "서비스 동작")

    return super.onStartCommand(intent, flags, startId)
  }

  override fun onDestroy() {
    super.onDestroy()

    Log.d("csy-service", "서비스 종료")
  }
}

class TimeBinder: Binder() {

}
