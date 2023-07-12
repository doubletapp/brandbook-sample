package ru.fiftytwochallenge.feature.challengelist.di

import ru.fiftytwochallenge.di.BaseApi
import ru.fiftytwochallenge.feature.challengelist.ChallengeListFragment

interface ChallengeListApi : BaseApi {

    fun inject(fragment: ChallengeListFragment)
}
