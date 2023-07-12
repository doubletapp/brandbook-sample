package ru.fiftytwochallenge.feature.profile.di

import ru.fiftytwochallenge.di.BaseApi
import ru.fiftytwochallenge.feature.profile.ProfileFragment

interface ProfileCreationApi : BaseApi {

    fun inject(fragment: ProfileFragment)
}
