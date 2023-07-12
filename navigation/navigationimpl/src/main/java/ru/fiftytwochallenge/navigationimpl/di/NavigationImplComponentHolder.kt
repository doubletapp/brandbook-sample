package ru.fiftytwochallenge.navigationimpl.di

import ru.fiftytwochallenge.di.BaseComponentHolder

object NavigationImplComponentHolder : BaseComponentHolder<
    NavigationImplApi,
    NavigationImplDependencies,
>() {

    override fun build(dependencies: NavigationImplDependencies): NavigationImplApi =
        DaggerNavigationImplComponent.factory().create(dependencies)
}
