package ru.fiftytwochallenge.feature.splash

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.fiftytwochallenge.feature.splash.di.SplashComponentHolder
import ru.fiftytwochallenge.navigationapi.NavigationApi
import ru.nikistos.fifitytwochallenge.feature.splash.R
import ru.nikistos.fifitytwochallenge.feature.splash.databinding.FiftyTwoChallengeAppSplashFragmentBinding
import javax.inject.Inject

class SplashFragment : Fragment(R.layout.fifty_two_challenge_app_splash_fragment) {

    private lateinit var binding: FiftyTwoChallengeAppSplashFragmentBinding

    @Inject
    lateinit var navigationApi: NavigationApi<SplashDirections>

    override fun onAttach(context: Context) {
        SplashComponentHolder.get().inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FiftyTwoChallengeAppSplashFragmentBinding.inflate(inflater, container, false)
        setOnClickListeners()
        return binding.root
    }

    override fun onDetach() {
        if (isRemoving) {
            SplashComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setOnClickListeners() {
        binding.actionButton.setOnClickListener {
            navigationApi.navigate(SplashDirections.ToList)
        }
    }
}