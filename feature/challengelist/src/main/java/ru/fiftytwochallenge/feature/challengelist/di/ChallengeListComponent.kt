package ru.fiftytwochallenge.feature.challengelist.di

import dagger.Component

@Component(
    dependencies = [ChallengeListDependencies::class],
)
interface ChallengeListComponent : ChallengeListApi {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: ChallengeListDependencies,
        ): ChallengeListComponent
    }
}
