package ru.fiftytwochallenge.feature.profile.di

import ru.fiftytwochallenge.di.BaseComponentHolder

object ProfileComponentHolder : BaseComponentHolder<
        ProfileCreationApi,
        ProfileDependencies,
>() {

    override fun build(dependencies: ProfileDependencies): ProfileCreationApi =
        DaggerProfileComponent.factory().create(dependencies)
}
