package ru.fiftytwochallenge.feature.challengelist.di

import ru.fiftytwochallenge.di.BaseComponentHolder

object ChallengeListComponentHolder : BaseComponentHolder<
        ChallengeListApi,
        ChallengeListDependencies,
>() {

    override fun build(dependencies: ChallengeListDependencies): ChallengeListApi =
        DaggerChallengeListComponent.factory().create(dependencies)
}
