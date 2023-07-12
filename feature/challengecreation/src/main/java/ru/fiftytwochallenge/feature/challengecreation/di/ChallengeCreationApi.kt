package ru.fiftytwochallenge.feature.challengecreation.di

import ru.fiftytwochallenge.di.BaseApi
import ru.fiftytwochallenge.feature.challengecreation.CreationFragment

interface ChallengeCreationApi : BaseApi {

    fun inject(fragment: CreationFragment)
}
