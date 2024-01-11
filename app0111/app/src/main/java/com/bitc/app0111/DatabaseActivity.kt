package com.bitc.app0111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.app0111.databinding.ActivityDatabaseBinding

class DatabaseActivity : AppCompatActivity() {

  private lateinit var binding: ActivityDatabaseBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityDatabaseBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val dbHelper = DBHelper(this)
    val database = dbHelper.readableDatabase

//    데이터 추가
    binding.btnInsert.setOnClickListener {
      val name = binding.etName.text.toString()
      val phone = binding.etPhone.text.toString()
      val email = binding.etEmail.text.toString()
      val address = binding.etAddress.text.toString()

      val data = PhoneBookData(name = name, phone = phone, email = email, address = address)

      dbHelper.dbInsert(database, data)

      clearText()
    }

    binding.btnUpdate.setOnClickListener {
      val seq = binding.etSeq.text.toString().toInt()
      val name = binding.etName.text.toString()
      val phone = binding.etPhone.text.toString()
      val email = binding.etEmail.text.toString()
      val address = binding.etAddress.text.toString()

      val data = PhoneBookData(seq = seq, name = name, phone = phone, email = email, address = address)

      dbHelper.dbUpdate(database, data)

      clearText()
    }

    binding.btnDelete.setOnClickListener {
      val seq = binding.etSeq.text.toString().toInt()
      dbHelper.dbDelete(database, seq)

      clearText()
    }

    binding.btnSelectAll.setOnClickListener {
      val text = dbHelper.dbSelectAll(database)
      binding.tvResult.text = text

      clearText()
    }

    binding.btnSelectSeq.setOnClickListener {
      val seq = binding.etSeq.text.toString().toInt()
      val text = dbHelper.dbSelectSeq(database, seq)
      binding.tvResult.text = text

      clearText()
    }

    binding.btnSelectName.setOnClickListener {
      val name = binding.etName.text.toString()
      val text = dbHelper.dbSelectName(database, name)
      binding.tvResult.text = text

      clearText()
    }
  }

  private fun clearText() {
    binding.etSeq.setText("")
    binding.etName.setText("")
    binding.etPhone.setText("")
    binding.etEmail.setText("")
    binding.etAddress.setText("")
  }
  
//  문제 1) UI에 이름, 전화번호, 이메일, 주소 를 입력받는 필드를 생성하고 해당 데이터를 가지고 사용자를 추가, 수정, 삭제, 조회 하도록 수정하세요
}









