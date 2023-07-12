package ru.fiftytwochallenge.navigationimpl.navigationapis

import androidx.navigation.NavController
import ru.fiftytwochallenge.feature.splash.SplashDirections
import ru.fiftytwochallenge.feature.splash.SplashFragmentDirections
import ru.fiftytwochallenge.navigationapi.NavigationApi
import javax.inject.Inject
import javax.inject.Provider

internal class SplashNavigationImpl @Inject constructor(
    private val navController: Provider<NavController>,
): NavigationApi<SplashDirections> {

    override fun navigate(direction: SplashDirections) {
        when (direction) {
            is SplashDirections.ToList -> {
                navController.get().navigate(SplashFragmentDirections.toList())
            }
        }
    }
}
