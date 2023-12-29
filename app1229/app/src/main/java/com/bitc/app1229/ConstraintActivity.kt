package com.bitc.app1229

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.app1229.databinding.ActivityConstraintBinding

class ConstraintActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityConstraintBinding.inflate(layoutInflater)
    setContentView(binding.root)
  }
}
