package ru.fiftytwochallenge.navigationimpl.navigationapis

import ru.fiftytwochallenge.navigationapi.NavigationApi
import androidx.navigation.NavController
import androidx.navigation.ui.navigateUp
import ru.fiftytwochallenge.feature.profile.ProfileDirections
import javax.inject.Inject
import javax.inject.Provider

internal class ProfileNavigationImpl @Inject constructor(
    private val navController: Provider<NavController>,
) : NavigationApi<ProfileDirections> {

    override fun navigate(direction: ProfileDirections) {
        when (direction) {
            is ProfileDirections.Up -> navController.get().navigateUp()
        }
    }
}
