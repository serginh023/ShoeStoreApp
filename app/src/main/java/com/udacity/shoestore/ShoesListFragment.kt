package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.udacity.shoestore.databinding.FragmentShoesListBinding
import com.udacity.shoestore.models.ShoeViewModel


class ShoesListFragment : Fragment() {

    val viewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentShoesListBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_shoes_list,
        container,
        false)


        //binding.shoeListViewModel.

        return binding.root
    }

}