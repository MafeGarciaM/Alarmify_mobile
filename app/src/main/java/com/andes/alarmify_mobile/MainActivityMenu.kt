package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.andes.alarmify_mobile.databinding.ActivityMainMenuBinding

class MainActivityMenu : AppCompatActivity() {
    private val tag  = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(tag,"OnCreate")
        super.onCreate(savedInstanceState)
        val binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener{
            Log.d(tag,"Menu Button")

            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)

        }

        binding.btnGoalarm.setOnClickListener{
            val intent  = Intent(this, CreateAlarm::class.java)
            startActivity((intent))

        }

        binding.btnAlarma.setOnClickListener{
            val intent  = Intent(this, CreateAlarm::class.java)
            startActivity((intent))

        }

        binding.btnPomodoro.setOnClickListener{
            val intent  = Intent(this, CreatePomodoro::class.java)
            startActivity((intent))

        }
    }
}