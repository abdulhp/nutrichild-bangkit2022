package com.cc22_ps197.nutrichild

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cc22_ps197.nutrichild.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addButton = binding.fab

        addButton.setOnClickListener {
            moveToInputPage()
        }
    }

    private fun moveToInputPage() {
        val intent = Intent(this@HomeActivity, InputDataActivity::class.java)
        startActivity(intent)
    }
}