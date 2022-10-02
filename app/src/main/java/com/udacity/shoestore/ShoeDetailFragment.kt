package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe


class ShoeDetailFragment : Fragment() {

//    private val viewModel: com.udacity.shoestore.models.ShoeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_shoe_detail,
        container,
        false)

        binding.ShoeDetailCancelButton.setOnClickListener {

            val shoe: Shoe = Shoe(
                binding.editTextName.text.toString(),
                binding.editTextSize.text.toString().toDouble(),
                binding.editTextCompany.text.toString(),
                binding.editTextDescription.text.toString()
                )

            findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoesListFragment())
        }

        binding.ShoeDetailCancelButton.setOnClickListener {
            findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoesListFragment())
        }

        return binding.root
    }

}