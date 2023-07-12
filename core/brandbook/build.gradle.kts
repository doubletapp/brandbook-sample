buildscript {
    project.apply {
        from("$rootDir/gradle/plugin/kotlin-android-ui.gradle")
    }
}

dependencies {
    api("com.google.android.material:material:1.9.0")
}