package ru.fiftytwochallenge.feature.splash.di

import dagger.Component

@Component(
    dependencies = [SplashDependencies::class],
)
interface SplashComponent : SplashApi {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: SplashDependencies,
        ): SplashComponent
    }
}
