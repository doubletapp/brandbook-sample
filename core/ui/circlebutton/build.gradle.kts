buildscript {
    project.apply {
        from("$rootDir/gradle/plugin/kotlin-android-ui.gradle")
    }
}

dependencies {
    implementation(project(":core::brandbook"))
}