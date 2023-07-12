package ru.fiftytwochallenge.feature.challengecreation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.fiftytwochallenge.feature.challengecreation.di.ChallengeCreationComponentHolder
import ru.fiftytwochallenge.navigationapi.NavigationApi
import ru.nikistos.fifitytwochallenge.feature.challengecreation.R
import ru.nikistos.fifitytwochallenge.feature.challengecreation.databinding.FiftyTwoChallengeCreationFragmentBinding
import javax.inject.Inject

class CreationFragment : Fragment(R.layout.fifty_two_challenge_creation_fragment) {

    private lateinit var binding: FiftyTwoChallengeCreationFragmentBinding

    @Inject
    lateinit var navigationApi: NavigationApi<ChallengeCreationDirections>

    override fun onAttach(context: Context) {
        ChallengeCreationComponentHolder.get().inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FiftyTwoChallengeCreationFragmentBinding.inflate(inflater, container, false)
        setOnClickListeners()
        return binding.root
    }

    override fun onDetach() {
        if (isRemoving) {
            ChallengeCreationComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setOnClickListeners() {
        binding.actionButton.setOnClickListener {
            navigationApi.navigate(ChallengeCreationDirections.Up)
        }
    }
}