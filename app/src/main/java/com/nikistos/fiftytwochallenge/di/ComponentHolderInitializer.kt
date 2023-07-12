package com.nikistos.fiftytwochallenge.di

import ru.fiftytwochallenge.feature.challengecreation.di.ChallengeCreationComponentHolder
import ru.fiftytwochallenge.feature.challengecreation.di.ChallengeCreationDependencies
import ru.fiftytwochallenge.feature.challengelist.di.ChallengeListComponentHolder
import ru.fiftytwochallenge.feature.challengelist.di.ChallengeListDependencies
import ru.fiftytwochallenge.feature.profile.di.ProfileComponentHolder
import ru.fiftytwochallenge.feature.profile.di.ProfileDependencies
import ru.fiftytwochallenge.feature.splash.di.SplashComponentHolder
import ru.fiftytwochallenge.feature.splash.di.SplashDependencies
import ru.fiftytwochallenge.navigationimpl.di.NavigationImplComponentHolder
import ru.fiftytwochallenge.navigationimpl.di.NavigationImplDependencies
import javax.inject.Inject
import javax.inject.Provider

internal class ComponentHolderInitializer @Inject constructor(
    private val navigationDependencies: Provider<NavigationImplDependencies>,
    private val splashDependencies: Provider<SplashDependencies>,
    private val profileDependencies: Provider<ProfileDependencies>,
    private val challengeCreationDependencies: Provider<ChallengeCreationDependencies>,
    private val challengeListDependencies: Provider<ChallengeListDependencies>,
) {

    fun init() {
        NavigationImplComponentHolder.init(navigationDependencies)
        SplashComponentHolder.init(splashDependencies)
        ProfileComponentHolder.init(profileDependencies)
        ChallengeCreationComponentHolder.init(challengeCreationDependencies)
        ChallengeListComponentHolder.init(challengeListDependencies)
    }
}
