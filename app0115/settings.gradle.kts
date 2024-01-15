pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
    maven (url = "https://devrepo.kakao.com/nexus/content/groups/public/")
    maven (url = "https://devrepo.kakao.com/nexus/repository/kakaomap-releases/")
    
//    네이버 지도 API 사용을 위한 SDK URL 설정
    maven (url = "https://naver.jfrog.io/artifactory/maven/")
  }
}

rootProject.name = "app0115"
include(":app")
