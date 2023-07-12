@file:Suppress("UnstableApiUsage")

buildscript {
    project.apply {
        plugin("com.android.application")
        plugin("org.jetbrains.kotlin.android")
        from("$rootDir/gradle/plugin/kotlin-kapt.gradle")
    }
}

android {
    namespace = "com.nikistos.fiftytwochallenge"
    compileSdk = 33

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    defaultConfig {
        applicationId = "com.nikistos.fiftytwochallenge"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":di"))
    implementation(project(":core::brandbook"))
    implementation(project(":feature::challengecreation"))
    implementation(project(":feature::challengelist"))
    implementation(project(":feature::profile"))
    implementation(project(":feature::splash"))
    implementation(project(":navigation::navigationimpl"))

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(project(":di"))
    implementation("com.google.dagger:dagger:2.44")
    kapt("com.google.dagger:dagger-compiler:2.44")
}