package ru.fiftytwochallenge.navigationimpl.navigationapis

import ru.fiftytwochallenge.navigationapi.NavigationApi
import androidx.navigation.NavController
import androidx.navigation.ui.navigateUp
import ru.fiftytwochallenge.feature.challengecreation.ChallengeCreationDirections
import javax.inject.Inject
import javax.inject.Provider

internal class ChallengeCreationNavigationImpl @Inject constructor(
    private val navController: Provider<NavController>,
) : NavigationApi<ChallengeCreationDirections> {

    override fun navigate(direction: ChallengeCreationDirections) {
        when (direction) {
            is ChallengeCreationDirections.Up -> navController.get().navigateUp()
        }
    }
}
