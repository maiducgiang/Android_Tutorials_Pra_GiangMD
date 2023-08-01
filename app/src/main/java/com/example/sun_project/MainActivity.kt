package com.example.sun_project

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.app.NotificationCompat
import com.example.sun_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent: Intent = Intent(Intent.ACTION_SEND)
        binding.intentFilterSend.setOnClickListener{

            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, "maiducgiang@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "send data")

            startActivity(Intent.createChooser(intent,"chon email"))
        }

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Chào mừng bạn quay trở lại",Toast.LENGTH_SHORT).show()
    }

}