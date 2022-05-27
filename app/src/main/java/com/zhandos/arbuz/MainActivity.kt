package com.zhandos.arbuz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhandos.arbuz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() =  _binding!!

    private var check = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chSend.isChecked = check
        binding.btnRegistration.isEnabled = binding.chSend.isChecked

        binding.chSend.setOnClickListener {
            binding.btnRegistration.isEnabled = binding.chSend.isChecked
        }

    }


    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}