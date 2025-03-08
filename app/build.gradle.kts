plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.evexdesignsx.auraframefx"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.evexdesignsx.auraframefx"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3" // Use the latest version
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Core dependencies
    implementation("androidx.core:core-ktx:1.12.0") // Use the latest version
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2") // Use the latest version
    implementation("androidx.activity:activity-compose:1.8.1") // Use the latest version
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2") // Use the latest version
    androidTestImplementation("androidx.test.ext:junit:1.1.5") // Use the latest version
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // Use the latest version
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Jetpack Compose dependencies
    implementation("androidx.compose.material:material:1.5.4") // Use the latest version
    implementation("androidx.compose.ui:ui:1.5.4") // Use the latest version
    implementation("androidx.compose.material:material-icons-core:1.5.4") // Use the latest version
    implementation("androidx.compose.material:material-icons-extended:1.5.4") // Use the latest version
    implementation("androidx.navigation:navigation-compose:2.7.5") // Use the latest version

    // Retrofit dependencies
    implementation("com.squareup.retrofit2:retrofit:2.9.0") // Use the latest version
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Use the latest version

    // Room Database dependencies
    implementation("androidx.room:room-runtime:2.6.0") // Use the latest version
    annotationProcessor("androidx.room:room-compiler:2.6.0") // Use the latest version
    implementation("androidx.room:room-ktx:2.6.0") // Use the latest version

    // Lottie Animation dependencies
    implementation("com.airbnb.android:lottie-compose:6.1.0") // Use the latest version

    // LSPosed dependencies
    compileOnly("de.robv.android.xposed:api:82") // Use the latest version
    compileOnly("de.robv.android.xposed:api:82:sources") // Use the latest version
}