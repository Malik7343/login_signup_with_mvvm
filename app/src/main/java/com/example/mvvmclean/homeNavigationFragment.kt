package com.example.mvvmclean

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.mvvmclean.databinding.FragmentHomeNavigationBinding
import com.example.mvvmclean.databinding.FragmentNoteListingBinding
import com.example.mvvmclean.ui.RegisterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class homeNavigationFragment : Fragment() {
    val TAG: String = "HomeNavigationFragment"
    lateinit var binding: FragmentHomeNavigationBinding
    val viewModel: RegisterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeNavigationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            viewModel.logout {
                findNavController().navigate(R.id.action_homeNavigationFragment_to_loginFragment)
            }
        }
    }



}


