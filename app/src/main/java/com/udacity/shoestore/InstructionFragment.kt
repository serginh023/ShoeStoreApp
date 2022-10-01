package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentInstructionBinding


class InstructionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding : FragmentInstructionBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_instruction,
        container,
        false)

        binding.InstructionsIAmReadyButton.setOnClickListener { v:View ->
            findNavController().navigate(InstructionFragmentDirections.actionInstructionFragmentToShoesListFragment())
        }

        return binding.root
    }
}