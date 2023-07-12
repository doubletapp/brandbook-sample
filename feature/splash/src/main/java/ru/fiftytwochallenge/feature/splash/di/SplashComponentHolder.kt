package ru.fiftytwochallenge.feature.splash.di

import ru.fiftytwochallenge.di.BaseComponentHolder

object SplashComponentHolder : BaseComponentHolder<
    SplashApi,
    SplashDependencies,
>() {

    override fun build(dependencies: SplashDependencies): SplashApi =
        DaggerSplashComponent.factory().create(dependencies)
}
