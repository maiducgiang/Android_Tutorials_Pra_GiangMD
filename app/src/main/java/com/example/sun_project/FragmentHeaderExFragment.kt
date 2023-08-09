package com.example.sun_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sun_project.databinding.FragmentHeaderExFragmentBinding

class FragmentHeaderExFragment : Fragment() {


    private val binding: FragmentHeaderExFragmentBinding by lazy {
        FragmentHeaderExFragmentBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.fragmentHeader.text = getString(R.string.article_like)
        binding.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            if (i == R.id.radio_button_yes) binding.fragmentHeader.text =
                getString(R.string.article_like)
            else binding.fragmentHeader.text = getString(R.string.article_thank)
        }
    }

}
