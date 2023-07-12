package ru.fiftytwochallenge.feature.challengecreation.di

import ru.fiftytwochallenge.di.BaseDependencies
import ru.fiftytwochallenge.feature.challengecreation.ChallengeCreationDirections
import ru.fiftytwochallenge.navigationapi.NavigationApi

interface ChallengeCreationDependencies : BaseDependencies {

    val navigationApi: NavigationApi<ChallengeCreationDirections>
}
