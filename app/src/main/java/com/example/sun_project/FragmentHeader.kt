package com.example.sun_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import com.example.sun_project.databinding.FragmentContentBinding
import com.example.sun_project.databinding.FragmentHeaderBinding

class FragmentHeader : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentHeaderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = FragmentHeaderBinding.inflate(layoutInflater)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = FragmentHeaderBinding.inflate(inflater)

        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.fragmentHeader.text = "ARTICLE: LIKE"
        binding.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            if(i == R.id.radio_button_yes) binding.fragmentHeader.text = "ARTICLE: LIKE"
            else  binding.fragmentHeader.text = "ARTICLE: THANK"
        }
    }

}
