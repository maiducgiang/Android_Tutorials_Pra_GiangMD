package com.example.sun_project.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sun_project.R
import com.example.sun_project.databinding.ActivityMainBinding
import com.example.sun_project.databinding.FragmentSecondBinding
import com.example.sun_project.databinding.FragmentSimpleBinding


class SimpleFragment : Fragment() {


    private var _binding: FragmentSimpleBinding?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSimpleBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment.

        return inflater.inflate(R.layout.fragment_simple, container, false)
    }


}