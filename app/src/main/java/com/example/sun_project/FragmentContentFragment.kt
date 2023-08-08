package com.example.sun_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sun_project.databinding.FragmentContentBinding

class FragmentContentFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val a: Int? = arguments?.getInt("int")
        a
        val binding = FragmentContentBinding.inflate(inflater)

        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment

        return binding.root
    }
}
