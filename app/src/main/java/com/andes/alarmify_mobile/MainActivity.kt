package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.andes.alarmify_mobile.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val tag  = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(tag,"OnCreate")
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener{
            Log.d(tag,"Menu Button")
            //Toast.makeText(this,"Crea tu pomodoro!", Toast.LENGTH_SHORT).show()
            val intent  = Intent(this, MainActivityMenu::class.java)
            //startActivity((intent))

            startActivity(Intent(this, MainActivityMenu::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)

        }

        binding.btnGoalarm1.setOnClickListener{
            val intent  = Intent(this, CreateAlarm::class.java)
            startActivity((intent))

        }
    }
}