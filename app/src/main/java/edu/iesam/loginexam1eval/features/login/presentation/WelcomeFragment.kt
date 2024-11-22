package edu.iesam.loginexam1eval.features.login.presentation

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.iesam.loginexam1eval.R
import edu.iesam.loginexam1eval.databinding.FragmentWelcomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class WelcomeFragment : Fragment() {

    private var _binding : FragmentWelcomeBinding? = null
    private val binding = _binding!!

    private val viewModel: WelcomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        binding.signIn.setOnClickListener{
            findNavController().navigate(R.id.action_welcome_fragment_to_login_fragment)
        }
        binding.signUp.setOnClickListener{
            findNavController().navigate(R.id.action_welcome_fragment_to_login_fragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}