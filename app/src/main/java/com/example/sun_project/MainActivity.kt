package com.example.sun_project

import android.app.DatePickerDialog
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
import java.util.*

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private var mainMenu: Menu? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent: Intent = Intent(Intent.ACTION_SEND)

        binding.nextPageCallApi.setOnClickListener {
            val intent = Intent(this, ThreeActivity::class.java)
            startActivity(intent)
        }
        binding.intentFilterSend.setOnClickListener {
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, "maiducgiang@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "send data")

            startActivity(Intent.createChooser(intent, "chon email"))
        }
        binding.dialogPicker.setOnClickListener{
            showDatePickerDialog()
        }
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Chào mừng bạn quay trở lại", Toast.LENGTH_SHORT).show()
    }

    private fun showDatePickerDialog() {
        // Get the current date for initialization of the Date Picker dialog
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Create and show the Date Picker dialog
        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->

                println(year + monthOfYear+ dayOfMonth)

            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        mainMenu = menu
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)

    }
}