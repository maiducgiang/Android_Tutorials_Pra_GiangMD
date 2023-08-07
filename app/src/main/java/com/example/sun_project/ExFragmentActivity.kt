package com.example.sun_project

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.sun_project.databinding.ActivityExFragmentBinding

class ExFragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }


}