package com.bitc.app1222

fun main() {
  function1()
  function2(10, 20)
  var result = function3()
  println("function3()에서 반환받은 값 : $result")
  result = function4(10, 20)
  println("function4()에서 반환받은 값 : $result")

  println("----------")

  function5("아이유", 30, false)
//  함수 호출 시 매개변수의 수에 맞게 데이터를 입력
//  function5("유재석", 50)
  function6("아이유", 30, false)
//  기본값을 사용하는 함수는 함수 호출 시 기본값을 사용하는 매개변수를 생략해도 상관없음
  function6("유재석", 50)


  function7("유인나", 35, false)
//  function7("유인나", false)

  println("\n ----- 명명된 매개변수 ----- \n")

  function6("유병재", 40, true)
  function6(age = 40, gender = true, name = "유병재")

// 기본값이 설정된 매개변수의 위치가 어디에 있더라도 명명된 매개변수 호출 방식을 사용하면 문제없이 실행이 가능함
  function7(name = "유병재", gender = true)
}

// 반환값이 없을 경우 Unit 생략 가능
fun function1() {
  println("반환값과 매개변수가 없는 함수")
}

// 반환값이 없을 경우 함수 뒤에 Unit 추가
// 매개변수 사용 시 var, val 키워드 생략(기본 val 사용)
fun function2(num1: Int, num2: Int): Unit {
  println("반환값은 없고, 매개변수가 있는 함수")
  println("num1: $num1, num2: $num2")
}

fun function3(): Int {
  println("반환값은 있고, 매개변수는 없는 함수")
  return 10
}

fun function4(num1: Int, num2: Int): Int {
  val result = num1 + num2
  println("반환값과 매개변수가 있는 함수")
  return result
}

// 기본 형식 매개변수를 사용하는 함수
fun function5(name: String, age: Int, gender: Boolean) {
  if (gender) {
    println("이름 : $name\n나이 : $age\n성별 : 남자")
  }
  else {
    println("이름 : $name\n나이 : $age\n성별 : 여자")
  }
}

// 매개변수에 기본값을 사용하는 함수
fun function6(name: String, age: Int, gender: Boolean = true) {
  if (gender) {
    println("이름 : $name\n나이 : $age\n성별 : 남자")
  }
  else {
    println("이름 : $name\n나이 : $age\n성별 : 여자")
  }
}

// 기본값을 가지고 있는 매개변수를 순서 중간에 설정하면 함수 호출 시 기본값을 가지고 있는 데이터를 생략하면 오류가 발생함
// 생략된 기본값 매개변수로 인하여 매개 변수 전달의 순서가 바뀌기 때문
fun function7(name: String, age: Int = 10, gender: Boolean) {
  if (gender) {
    println("이름 : $name\n나이 : $age\n성별 : 남자")
  }
  else {
    println("이름 : $name\n나이 : $age\n성별 : 여자")
  }
}

// 문제1) Test4 파일 생성 후 사칙 연산을 위한 함수 4개를 선언하고 실행하는 프로그램을 작성하세요
// # add(매개변수만 있는 형식), sub(반환값만 있는 형식), multi(매개변수와 반환값이 있는 형식), div(매개변수와 반환값이 없는 형식) 함수 선언





