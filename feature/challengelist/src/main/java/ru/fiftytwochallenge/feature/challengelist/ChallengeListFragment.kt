package ru.fiftytwochallenge.feature.challengelist

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.fiftytwochallenge.feature.challengelist.di.ChallengeListComponentHolder
import ru.fiftytwochallenge.navigationapi.NavigationApi
import ru.nikistos.fifitytwochallenge.feature.challengelist.R
import ru.nikistos.fifitytwochallenge.feature.challengelist.databinding.FiftyTwoChallengeAppChallengeListFragmentBinding
import javax.inject.Inject

class ChallengeListFragment : Fragment(R.layout.fifty_two_challenge_app_challenge_list_fragment) {

    private lateinit var binding: FiftyTwoChallengeAppChallengeListFragmentBinding

    @Inject
    lateinit var navigationApi: NavigationApi<ChallengeListDirections>

    override fun onAttach(context: Context) {
        ChallengeListComponentHolder.get().inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding =
            FiftyTwoChallengeAppChallengeListFragmentBinding.inflate(inflater, container, false)
        setOnClickListeners()
        return binding.root
    }

    override fun onDetach() {
        if (isRemoving) {
            ChallengeListComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setOnClickListeners() {
        with(binding) {
            accountButton.setOnClickListener {
                navigationApi.navigate(ChallengeListDirections.ToProfile)
            }
            addButton.setOnClickListener {
                navigationApi.navigate(ChallengeListDirections.ToCreation)
            }
            addPlaceholder.setOnClickListener {
                navigationApi.navigate(ChallengeListDirections.ToCreation)
            }
        }
    }
}