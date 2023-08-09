package com.example.sun_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sun_project.databinding.FragmentContentExFragmentBinding

class FragmentContentExFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentContentExFragmentBinding.inflate(inflater)

        return binding.root
    }
}
