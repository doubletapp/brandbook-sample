package ru.fiftytwochallenge.feature.challengelist

sealed interface ChallengeListDirections {
    object ToCreation : ChallengeListDirections
    object ToProfile : ChallengeListDirections
}