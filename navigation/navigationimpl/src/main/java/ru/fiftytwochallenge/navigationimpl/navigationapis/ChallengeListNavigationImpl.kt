package ru.fiftytwochallenge.navigationimpl.navigationapis

import ru.fiftytwochallenge.navigationapi.NavigationApi
import androidx.navigation.NavController
import ru.fiftytwochallenge.feature.challengelist.ChallengeListDirections
import ru.fiftytwochallenge.feature.challengelist.ChallengeListFragmentDirections
import javax.inject.Inject
import javax.inject.Provider

internal class ChallengeListNavigationImpl @Inject constructor(
    private val navController: Provider<NavController>,
): NavigationApi<ChallengeListDirections> {

    override fun navigate(direction: ChallengeListDirections) {
        when (direction) {
            is ChallengeListDirections.ToCreation -> {
                navController.get().navigate(ChallengeListFragmentDirections.toCreation())
            }
            is ChallengeListDirections.ToProfile -> {
                navController.get().navigate(ChallengeListFragmentDirections.toProfile())
            }
        }
    }
}
