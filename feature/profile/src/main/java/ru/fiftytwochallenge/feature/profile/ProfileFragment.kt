package ru.fiftytwochallenge.feature.profile

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.fiftytwochallenge.feature.profile.di.ProfileComponentHolder
import ru.fiftytwochallenge.navigationapi.NavigationApi
import ru.nikistos.fifitytwochallenge.feature.profile.R
import ru.nikistos.fifitytwochallenge.feature.profile.databinding.FiftytwochallengeAppProfileFragmentBinding
import javax.inject.Inject

class ProfileFragment : Fragment(R.layout.fiftytwochallenge_app_profile_fragment) {

    private lateinit var binding: FiftytwochallengeAppProfileFragmentBinding

    @Inject
    lateinit var navigationApi: NavigationApi<ProfileDirections>

    override fun onAttach(context: Context) {
        ProfileComponentHolder.get().inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FiftytwochallengeAppProfileFragmentBinding.inflate(inflater, container, false)
        setOnClickListeners()
        return binding.root
    }

    override fun onDetach() {
        if (isRemoving) {
            ProfileComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setOnClickListeners() {
        binding.backButton.setOnClickListener {
            navigationApi.navigate(ProfileDirections.Up)
        }
    }
}