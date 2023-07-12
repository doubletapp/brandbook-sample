package ru.fiftytwochallenge.feature.profile.di

import ru.fiftytwochallenge.di.BaseDependencies
import ru.fiftytwochallenge.feature.profile.ProfileDirections
import ru.fiftytwochallenge.navigationapi.NavigationApi

interface ProfileDependencies : BaseDependencies {

    val navigationApi: NavigationApi<ProfileDirections>
}
