package ru.fiftytwochallenge.feature.challengecreation.di

import ru.fiftytwochallenge.di.BaseComponentHolder

object ChallengeCreationComponentHolder : BaseComponentHolder<
    ChallengeCreationApi,
    ChallengeCreationDependencies,
>() {

    override fun build(dependencies: ChallengeCreationDependencies): ChallengeCreationApi =
        DaggerChallengeCreationComponent.factory().create(dependencies)
}
