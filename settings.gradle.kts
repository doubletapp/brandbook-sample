@file:Suppress("UnstableApiUsage")

rootProject.name = "fiftytwochallenge"
include(":app")

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
    }
}

includeRecursive(File("core"))
includeRecursive(File("feature"))
includeRecursive(File("di"))
includeRecursive(File("navigation"))

fun includeRecursive(dir: File, lastDirsNames: List<String> = listOf(dir.name)) {
    if (isModule(dir)) {
        val moduleName = lastDirsNames.joinToString(
            prefix = ":",
            separator = ":"
        )
        include(moduleName)
        project(moduleName).projectDir = dir
    } else {
        dir.listFiles()?.forEach { file ->
            includeRecursive(file, lastDirsNames + file.name)
        }
    }
}

fun isModule(dir: File): Boolean {
    return File(dir, "build.gradle").isFile || File(dir, "build.gradle.kts").isFile
}