package com.example.sun_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.navigation.ui.AppBarConfiguration
import com.example.sun_project.databinding.ActivityExFragmentBinding

class ExFragmentActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    private val binding: ActivityExFragmentBinding by lazy {
        ActivityExFragmentBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //TODO: code add fragment to activity
//        if (savedInstanceState == null) {
////            supportFragmentManager.commit {
////                setReorderingAllowed(true)
////                add<FragmentContentExFragment>(R.id.fragment_container_view)
////            }
//            supportFragmentManager.commit {
//                setReorderingAllowed(true)
//                add<FragmentHeaderExFragment>(R.id.fragment_header)
//            }
//        }

        binding.button.setOnClickListener {
            if (binding.button.text == getString(R.string.open)) {
                binding.button.text = getString(R.string.close)
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<FragmentHeaderExFragment>(R.id.fragment_header)
                }
            } else {
                val fragmentManager: FragmentManager = supportFragmentManager

                // Tìm Fragment theo ID hoặc tên, ví dụ tên: YourFragment
                val fragment: Fragment? = fragmentManager.findFragmentById(R.id.fragment_header)

                // Ẩn Fragment nếu tồn tại
                fragment?.let {
                    fragmentManager.beginTransaction().hide(it).commit()
                }
                binding.button.text = getString(R.string.open)
            }

        }
    }


}
