package ru.fiftytwochallenge.feature.challengelist.di

import ru.fiftytwochallenge.di.BaseDependencies
import ru.fiftytwochallenge.feature.challengelist.ChallengeListDirections
import ru.fiftytwochallenge.navigationapi.NavigationApi

interface ChallengeListDependencies : BaseDependencies {

    val navigationApi: NavigationApi<ChallengeListDirections>
}
