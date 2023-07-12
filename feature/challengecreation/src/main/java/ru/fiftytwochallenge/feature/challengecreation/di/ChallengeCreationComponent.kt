package ru.fiftytwochallenge.feature.challengecreation.di

import dagger.Component

@Component(
    dependencies = [ChallengeCreationDependencies::class],
)
interface ChallengeCreationComponent : ChallengeCreationApi {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: ChallengeCreationDependencies,
        ): ChallengeCreationComponent
    }
}
