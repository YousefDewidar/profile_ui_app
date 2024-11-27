package com.yousef.profiletask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import com.yousef.profiletask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.emailData.text = getString(R.string.email_data)
        binding.dateData.text = getString(R.string.date_data)
        binding.nameData.text = getString(R.string.name_data)
        binding.passData.text = getString(R.string.password_data)
        binding.circleImageView.setImageResource(R.drawable.profile_image)




    }
}