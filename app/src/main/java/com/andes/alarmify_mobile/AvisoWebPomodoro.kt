package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andes.alarmify_mobile.databinding.ActivityAvisoWebBinding

class AvisoWebPomodoro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityAvisoWebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAceptar.setOnClickListener{
            startActivity(Intent(this, CreatePomodoro::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}