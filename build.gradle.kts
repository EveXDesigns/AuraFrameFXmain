plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://api.xposed.info/repo/")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2") // Use the latest version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0") // Use the latest version
    }
}

allprojects {
    repositories {
        // ... other repositories ...
        maven { url = uri("https://maven.lsposed.org") }
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}