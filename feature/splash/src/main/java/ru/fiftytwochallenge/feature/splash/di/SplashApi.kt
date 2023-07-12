package ru.fiftytwochallenge.feature.splash.di

import ru.fiftytwochallenge.di.BaseApi
import ru.fiftytwochallenge.feature.splash.SplashFragment

interface SplashApi : BaseApi {

    fun inject(fragment: SplashFragment)
}
