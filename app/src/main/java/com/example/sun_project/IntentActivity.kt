package com.example.sun_project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sun_project.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {

    private val binding: ActivityIntentBinding by lazy {
        ActivityIntentBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.buttonText.setOnClickListener {
            val text: String = binding.editTextText.text.toString()
            var intent: Intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT, text)

            startActivity(Intent.createChooser(intent, "chon email"))
        }
        binding.buttonLocation.setOnClickListener {

            val latitude = 40.7128
            val longitude = -74.0060

            // Tạo Uri của địa điểm dựa trên tọa độ
            val locationUri = Uri.parse("geo:$latitude,$longitude")

            // Tạo Intent với hành động ACTION_VIEW và Uri của địa điểm
            val intent = Intent(Intent.ACTION_VIEW, locationUri)

            startActivity(intent)

        }
        binding.buttonWeb.setOnClickListener {
            val web: String = binding.editTextWeb.text.toString()
            if (web != "") {
                val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://$web"))
                startActivity(intent)
            }
        }
    }
}