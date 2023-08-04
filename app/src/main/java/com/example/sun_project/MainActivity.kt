package com.example.sun_project

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.sun_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intentRecept = this.intent


        val extras = intentRecept.extras


        if (extras != null) {
            val data = extras.getString("key") // Lấy dữ liệu với key là "key"
            print(data)
        }

//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent: Intent = Intent(Intent.ACTION_SEND)
        binding.intentFilterSend.setOnClickListener{

            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, "maiducgiang@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "send data")

            startActivity(Intent.createChooser(intent,"chon email"))
        }

    }



}
