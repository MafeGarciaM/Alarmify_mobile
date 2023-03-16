package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andes.alarmify_mobile.databinding.ActivityAvisoExternoBinding
import com.andes.alarmify_mobile.databinding.ActivityAvisoWebBinding

class AvisoExterno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityAvisoExternoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAceptar.setOnClickListener{
            startActivity(Intent(this, CreateAlarm::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}