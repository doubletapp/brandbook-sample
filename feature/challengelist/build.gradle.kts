buildscript {
    project.apply {
        from("$rootDir/gradle/plugin/kotlin-android-ui.gradle")
        from("$rootDir/gradle/plugin/kotlin-kapt.gradle")
    }
}

dependencies {
    implementation(project(":core::brandbook"))
    implementation(project(":navigation::navigationapi"))

    implementation(project(":di"))
    implementation("com.google.dagger:dagger:2.44")
    kapt("com.google.dagger:dagger-compiler:2.44")
}
