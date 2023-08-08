package com.example.sun_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.navigation.ui.AppBarConfiguration
import com.example.sun_project.databinding.ActivityFragmentExBinding

class FragmentExActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityFragmentExBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentExBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FragmentContentFragment>(R.id.fragment_container_view)
            }
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FragmentHeader>(R.id.fragment_header)
            }
        }
    }


}
