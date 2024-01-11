package com.bitc.app0111

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) :SQLiteOpenHelper(context, "testdb", null, 1) {
  override fun onCreate(db: SQLiteDatabase?) {
    db?.execSQL("CREATE TABLE phonebook (\n" +
        "    seq     INTEGER PRIMARY KEY AUTOINCREMENT\n" +
        "                    NOT NULL,\n" +
        "    name    TEXT    NOT NULL,\n" +
        "    phone   TEXT NOT NULL,\n" +
        "    email   TEXT,\n" +
        "    address TEXT\n" +
        ")")
  }

  override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

  }

  fun dbInsert(db: SQLiteDatabase?, member: PhoneBookData) {
    var sql = "INSERT INTO phonebook (name, phone, email, address) " +
        "VALUES ('${member.name}', '${member.phone}', '${if (member.email != null || !member.email.equals("")) member.email else null}', '${if (member.address != null) member.address else null }') "

    db?.execSQL(sql)
  }

  fun dbUpdate(db: SQLiteDatabase?, member: PhoneBookData) {
    var sql = "UPDATE phonebook SET " +
        "name = ?, " +
        "phone = ?, " +
        "email = ?, " +
        "address = ? " +
        "WHERE seq = ? "

    db?.execSQL(sql, arrayOf(member.name, member.phone, member.email, member.address, member.seq))
  }

  fun dbDelete(db: SQLiteDatabase?, seq: Int) {
    var sql = "DELETE FROM phonebook "
    sql += "WHERE seq = $seq "

    db?.execSQL(sql)
  }

  fun dbSelectAll(db: SQLiteDatabase?) : String {
    var sql = "SELECT seq, name, phone, email, address FROM phonebook "
    var dataSet = db?.rawQuery(sql, null)

    var result = ""

    while (dataSet!!.moveToNext()) {
      result += "번호 : ${dataSet.getInt(0)} \n"
      result += "이름 : ${dataSet.getString(1)} \n"
      result += "전화번호 : ${dataSet.getString(2)} \n"
      result += "이메일 : ${dataSet.getString(3)} \n"
      result += "주소 : ${dataSet.getString(4)} \n"
      result += "\n-------------------\n"
    }

    return result
  }

  fun dbSelectSeq(db: SQLiteDatabase?, seq: Int) : String {
    var sql = "SELECT seq, name, phone, email, address FROM phonebook " +
        "WHERE seq = $seq"
    var dataSet = db?.rawQuery(sql, null)

    var result = ""

    while (dataSet!!.moveToNext()) {
      result += "번호 : ${dataSet.getInt(0)} \n"
      result += "이름 : ${dataSet.getString(1)} \n"
      result += "전화번호 : ${dataSet.getString(2)} \n"
      result += "이메일 : ${dataSet.getString(3)} \n"
      result += "주소 : ${dataSet.getString(4)} \n"
      result += "\n-------------------\n"
    }

    return result
  }

  fun dbSelectName(db: SQLiteDatabase?, name: String) : String {
    var sql = "SELECT seq, name, phone, email, address FROM phonebook " +
        "WHERE name like '%$name%'"
    var dataSet = db?.rawQuery(sql, null)

    var result = ""

    while (dataSet!!.moveToNext()) {
      result += "번호 : ${dataSet.getInt(0)} \n"
      result += "이름 : ${dataSet.getString(1)} \n"
      result += "전화번호 : ${dataSet.getString(2)} \n"
      result += "이메일 : ${dataSet.getString(3)} \n"
      result += "주소 : ${dataSet.getString(4)} \n"
      result += "\n-------------------\n"
    }

    return result
  }

}










