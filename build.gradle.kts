plugins {
  java
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web:3.1.2")
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(20))
  }
}
