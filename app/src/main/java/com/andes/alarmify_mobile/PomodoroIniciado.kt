package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andes.alarmify_mobile.databinding.ActivityAvisoWebBinding
import com.andes.alarmify_mobile.databinding.ActivityPomodoroIniciadoBinding

class PomodoroIniciado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPomodoroIniciadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheck.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}