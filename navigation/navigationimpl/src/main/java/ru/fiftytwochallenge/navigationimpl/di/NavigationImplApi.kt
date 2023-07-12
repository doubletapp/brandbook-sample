package ru.fiftytwochallenge.navigationimpl.di

import ru.fiftytwochallenge.di.BaseApi
import ru.fiftytwochallenge.feature.challengecreation.ChallengeCreationDirections
import ru.fiftytwochallenge.feature.challengelist.ChallengeListDirections
import ru.fiftytwochallenge.feature.profile.ProfileDirections
import ru.fiftytwochallenge.feature.splash.SplashDirections
import ru.fiftytwochallenge.navigationapi.NavigationApi

interface NavigationImplApi : BaseApi {

    val splashNavApi: NavigationApi<SplashDirections>

    val profileNavApi: NavigationApi<ProfileDirections>

    val challengeCreationNavApi: NavigationApi<ChallengeCreationDirections>

    val challengeListNavApi: NavigationApi<ChallengeListDirections>
}
