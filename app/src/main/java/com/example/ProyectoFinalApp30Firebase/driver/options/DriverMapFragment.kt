package com.example.ProyectoFinalApp30Firebase.driver.options

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.DriverMapFragmentBinding


class DriverMapFragment : Fragment() {

    private lateinit var binding: DriverMapFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        binding = DriverMapFragmentBinding.inflate(inflater,container,false)
        binding.button2.setOnClickListener(){
            findNavController().navigate(R.id.action_mapDriverFragment_to_driverFragment)
        }
        return binding.root
    }



}