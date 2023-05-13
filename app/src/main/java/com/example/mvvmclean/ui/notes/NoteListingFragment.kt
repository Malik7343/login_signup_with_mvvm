package com.example.mvvmclean.ui.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.mvvmclean.R
import com.example.mvvmclean.databinding.FragmentForgetPasswordBinding
import com.example.mvvmclean.databinding.FragmentNoteListingBinding
import com.example.mvvmclean.ui.RegisterViewModel
import com.example.mvvmclean.uitl.UiState
import com.example.mvvmclean.uitl.hide
import com.example.mvvmclean.uitl.show
import com.example.mvvmclean.uitl.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteListingFragment : Fragment() {


    val TAG: String = "NoteListingFragment"
    lateinit var binding: FragmentNoteListingBinding
    val viewModel: RegisterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }



}


