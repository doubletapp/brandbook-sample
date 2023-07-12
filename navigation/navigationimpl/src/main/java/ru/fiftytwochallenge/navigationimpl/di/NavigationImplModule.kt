package ru.fiftytwochallenge.navigationimpl.di

import ru.fiftytwochallenge.navigationimpl.NavigationActivityProvider
import androidx.navigation.NavController
import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.fiftytwochallenge.feature.challengecreation.ChallengeCreationDirections
import ru.fiftytwochallenge.feature.challengelist.ChallengeListDirections
import ru.fiftytwochallenge.feature.profile.ProfileDirections
import ru.fiftytwochallenge.feature.splash.SplashDirections
import ru.fiftytwochallenge.navigationapi.NavigationApi
import ru.fiftytwochallenge.navigationimpl.navigationapis.ChallengeCreationNavigationImpl
import ru.fiftytwochallenge.navigationimpl.navigationapis.ChallengeListNavigationImpl
import ru.fiftytwochallenge.navigationimpl.navigationapis.ProfileNavigationImpl
import ru.fiftytwochallenge.navigationimpl.navigationapis.SplashNavigationImpl

@Module(
    includes = [NavigationImplModule.Binder::class],
)
internal class NavigationImplModule {

    @Provides
    fun provideNavController(
        activityProvider: NavigationActivityProvider,
    ): NavController = activityProvider.get()
        ?.getNavigationFragment()
        ?.navController
        ?: error("Do not make navigation calls while activity is not available")

    @Module
    interface Binder {

        @Binds
        fun bindSplashNavigationApi(api: SplashNavigationImpl): NavigationApi<SplashDirections>

        @Binds
        fun bindProfileNavigationApi(api: ProfileNavigationImpl): NavigationApi<ProfileDirections>

        @Binds
        fun bindChallengesListNavigationApi(
            api: ChallengeListNavigationImpl
        ): NavigationApi<ChallengeListDirections>

        @Binds
        fun bindChallengesCreationNavigationApi(
            api: ChallengeCreationNavigationImpl
        ): NavigationApi<ChallengeCreationDirections>
    }
}
