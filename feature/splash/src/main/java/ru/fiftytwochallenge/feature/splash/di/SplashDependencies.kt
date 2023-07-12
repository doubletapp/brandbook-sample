package ru.fiftytwochallenge.feature.splash.di

import ru.fiftytwochallenge.di.BaseDependencies
import ru.fiftytwochallenge.feature.splash.SplashDirections
import ru.fiftytwochallenge.navigationapi.NavigationApi

interface SplashDependencies : BaseDependencies {

    val navigationApi: NavigationApi<SplashDirections>
}
