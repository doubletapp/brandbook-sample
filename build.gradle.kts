plugins {
    id("com.android.application").version("7.4.2").apply(false)
    id("com.android.library").version("7.4.2").apply(false)
    id("org.jetbrains.kotlin.android").version("1.8.0").apply(false)
    id("androidx.navigation.safeargs.kotlin").version("2.4.2").apply(false)
}

subprojects {
    plugins.matching { it is com.android.build.gradle.AppPlugin || it is com.android.build.gradle.LibraryPlugin }
        .whenPluginAdded {
            configure<com.android.build.gradle.BaseExtension> {
                compileSdkVersion(33)
                defaultConfig {
                    minSdk = 26
                    targetSdk = 33
                    versionCode = 1
                    versionName = "1.0"
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
            }
        }
}