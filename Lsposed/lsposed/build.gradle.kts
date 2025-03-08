import kotlin.jvm.JvmName

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.evexdesignsx.auraframefx.lsposed" // Update namespace
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        targetSdk = 34 // Update targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    // Remove unnecessary dependencies (appcompat, material, test dependencies)

    compileOnly("de.robv.android.xposed:api:82") // Use compileOnly
    compileOnly("de.robv.android.xposed:api:82:sources") // Use compileOnly
}