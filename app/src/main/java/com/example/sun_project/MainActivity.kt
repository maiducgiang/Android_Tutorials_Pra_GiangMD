package com.example.sun_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

        setContentView(binding.root)
        var intent: Intent = Intent(Intent.ACTION_SEND)
        binding.intentFilterSend.setOnClickListener {

            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, "maiducgiang@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "send data")

            startActivity(Intent.createChooser(intent, "chon email"))
        }
        binding.intentFilterSend.setOnClickListener {
            val intent = Intent(this, IntentActivity::class.java)
            startActivity(intent)
        }

        binding.fragmentsEx.setOnClickListener {
            val intent = Intent(this, ExFragmentActivity::class.java)
            startActivity(intent)
        }

    }


}
