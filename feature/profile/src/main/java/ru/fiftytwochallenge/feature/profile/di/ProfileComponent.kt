package ru.fiftytwochallenge.feature.profile.di

import dagger.Component

@Component(
    dependencies = [ProfileDependencies::class],
)
interface ProfileComponent : ProfileCreationApi {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: ProfileDependencies,
        ): ProfileComponent
    }
}
