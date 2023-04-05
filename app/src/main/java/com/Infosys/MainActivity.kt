package com.Infosys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Infosys.databinding.ActivityMainBinding

import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // based on layout activity name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)



        binding.ageButton.setOnClickListener {

            val userDOB: Int = Integer.parseInt(binding.dateEnter.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            var  userAgeInYears:Int= currentYear - userDOB

            binding.ageText.text = "Your Age is $userAgeInYears"
        }
   }
}