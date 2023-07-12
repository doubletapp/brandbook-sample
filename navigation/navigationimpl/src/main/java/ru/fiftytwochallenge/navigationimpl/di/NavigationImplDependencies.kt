package ru.fiftytwochallenge.navigationimpl.di

import ru.fiftytwochallenge.navigationimpl.NavigationActivityProvider
import ru.fiftytwochallenge.di.BaseDependencies

interface NavigationImplDependencies : BaseDependencies {

    val activityProvider: NavigationActivityProvider
}
