package com.example.ProyectoFinalApp30Firebase.user.options

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.PassengerMapFragmentBinding


class PassengerMapFragment : Fragment() {

    private lateinit var binding: PassengerMapFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = PassengerMapFragmentBinding.inflate(inflater,container,false)

        binding.button15.setOnClickListener(){
            findNavController().navigate(R.id.action_passengerMapFragment_to_passengerFragment)
        }
        return binding.root

    }


}