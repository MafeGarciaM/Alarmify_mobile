package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.andes.alarmify_mobile.databinding.ActivityAvisoWebBinding
import com.andes.alarmify_mobile.databinding.ActivityMainBinding

class AvisoWeb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityAvisoWebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAceptar.setOnClickListener{
            startActivity(Intent(this, CreateAlarm::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}