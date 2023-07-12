package com.nikistos.fiftytwochallenge.di

import dagger.Module
import dagger.Provides
import ru.fiftytwochallenge.feature.challengecreation.ChallengeCreationDirections
import ru.fiftytwochallenge.feature.challengecreation.di.ChallengeCreationDependencies
import ru.fiftytwochallenge.feature.challengelist.ChallengeListDirections
import ru.fiftytwochallenge.feature.challengelist.di.ChallengeListDependencies
import ru.fiftytwochallenge.feature.profile.ProfileDirections
import ru.fiftytwochallenge.feature.profile.di.ProfileDependencies
import ru.fiftytwochallenge.feature.splash.SplashDirections
import ru.fiftytwochallenge.feature.splash.di.SplashDependencies
import ru.fiftytwochallenge.navigationapi.NavigationApi
import ru.fiftytwochallenge.navigationimpl.NavigationActivityProvider
import ru.fiftytwochallenge.navigationimpl.di.NavigationImplComponentHolder
import ru.fiftytwochallenge.navigationimpl.di.NavigationImplDependencies

@Module
internal class AppModule {
    
    @Provides
    fun provideNavigationDependencies(
        activityProvider: NavigationActivityProvider,
    ): NavigationImplDependencies = object : NavigationImplDependencies {
        override val activityProvider: NavigationActivityProvider = activityProvider
    }
    
    @Provides
    fun provideSplashDependencies(): SplashDependencies =
        object : SplashDependencies {
            override val navigationApi: NavigationApi<SplashDirections> =
                NavigationImplComponentHolder.get().splashNavApi
        }
    
    @Provides
    fun provideProfileDependencies(): ProfileDependencies  =
        object : ProfileDependencies {
            override val navigationApi: NavigationApi<ProfileDirections> =
                NavigationImplComponentHolder.get().profileNavApi
        }
    
    @Provides
    fun provideChallengeCreationDependencies(): ChallengeCreationDependencies =
        object : ChallengeCreationDependencies {
            override val navigationApi: NavigationApi<ChallengeCreationDirections> =
                NavigationImplComponentHolder.get().challengeCreationNavApi
        }

    @Provides
    fun provideChallengeListDependencies(): ChallengeListDependencies =
        object : ChallengeListDependencies {
            override val navigationApi: NavigationApi<ChallengeListDirections> =
                NavigationImplComponentHolder.get().challengeListNavApi
        }
}
