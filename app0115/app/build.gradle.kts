plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
}

android {
  namespace = "com.bitc.testmaps.app0115"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.bitc.testmaps.app0115"
    minSdk = 26
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  viewBinding {
    enable = true
  }
}

dependencies {

  implementation("androidx.core:core-ktx:1.12.0")
  implementation("androidx.appcompat:appcompat:1.6.1")
  implementation("com.google.android.material:material:1.11.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

//  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
//  implementation(files("libs/libDaumMapAndroid.jar"))

  implementation("com.kakao.maps.open:android:2.6.0")

  implementation ("com.kakao.sdk:v2-all:2.19.0") // 전체 모듈 설치, 2.11.0 버전부터 지원
  implementation ("com.kakao.sdk:v2-user:2.19.0") // 카카오 로그인
  implementation ("com.kakao.sdk:v2-talk:2.19.0") // 친구, 메시지(카카오톡)
  implementation ("com.kakao.sdk:v2-share:2.19.0") // 메시지(카카오톡 공유)
  implementation ("com.kakao.sdk:v2-friend:2.19.0") // 카카오톡 소셜 피커, 리소스 번들 파일 포함
  implementation ("com.kakao.sdk:v2-navi:2.19.0") // 카카오내비
  implementation ("com.kakao.sdk:v2-cert:2.19.0") // 카카오 인증서비스

//  네이버 지도 API 사용을 위한 종속성 설정
  implementation("com.naver.maps:map-sdk:3.17.0")
}
