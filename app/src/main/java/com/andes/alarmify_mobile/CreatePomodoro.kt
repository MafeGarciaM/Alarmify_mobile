package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.andes.alarmify_mobile.databinding.ActivityCreateAlarmBinding
import com.andes.alarmify_mobile.databinding.ActivityCreatePomodoroBinding

class CreatePomodoro : AppCompatActivity() {

    var btn_5 = false
    var btn_15 = false
    var btn_25 = false
    var btn_35 = false
    var btn_45 = false

    var etiqueta1 = false
    var etiqueta2 = false
    var etiqueta3 = false

    var time = 0

    var btn_color_ap = Color.parseColor("#9E59517B")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCreatePomodoroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        binding.btnSaveAlarm.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
            Toast.makeText(this,"Pomodoro Creado", Toast.LENGTH_SHORT).show()
        }

        binding.btn5.setOnClickListener{
            if(btn_15 || btn_25 || btn_35 || btn_45){
                binding.btn15.setBackgroundColor(btn_color_ap)
                binding.btn25.setBackgroundColor(btn_color_ap)
                binding.btn35.setBackgroundColor(btn_color_ap)
                binding.btn45.setBackgroundColor(btn_color_ap)

                btn_15 = false
                btn_25 = false
                btn_35 = false
                btn_45 = false
            }
            binding.btn5.setBackgroundColor(Color.BLACK)
            btn_5 = true
        }

        binding.btn15.setOnClickListener{
            if(btn_5 || btn_25 || btn_35 || btn_45){
                binding.btn5.setBackgroundColor(btn_color_ap)
                binding.btn25.setBackgroundColor(btn_color_ap)
                binding.btn35.setBackgroundColor(btn_color_ap)
                binding.btn45.setBackgroundColor(btn_color_ap)

                btn_5 = false
                btn_25 = false
                btn_35 = false
                btn_45 = false
            }
            binding.btn15.setBackgroundColor(Color.BLACK)
            btn_15 = true
        }

        binding.btn25.setOnClickListener{
            if(btn_5 || btn_15 || btn_35 || btn_45){
                binding.btn5.setBackgroundColor(btn_color_ap)
                binding.btn15.setBackgroundColor(btn_color_ap)
                binding.btn35.setBackgroundColor(btn_color_ap)
                binding.btn45.setBackgroundColor(btn_color_ap)

                btn_5 = false
                btn_15 = false
                btn_35 = false
                btn_45 = false
            }
            binding.btn25.setBackgroundColor(Color.BLACK)
            btn_25 = true
        }

        binding.btn35.setOnClickListener{
            if(btn_5 || btn_15 || btn_25 || btn_45){
                binding.btn5.setBackgroundColor(btn_color_ap)
                binding.btn15.setBackgroundColor(btn_color_ap)
                binding.btn25.setBackgroundColor(btn_color_ap)
                binding.btn45.setBackgroundColor(btn_color_ap)

                btn_5 = false
                btn_15 = false
                btn_25 = false
                btn_45 = false
            }
            binding.btn35.setBackgroundColor(Color.BLACK)
            btn_35 = true
        }

        binding.btn45.setOnClickListener{
            if(btn_5 || btn_15 || btn_25 || btn_35){
                binding.btn5.setBackgroundColor(btn_color_ap)
                binding.btn15.setBackgroundColor(btn_color_ap)
                binding.btn25.setBackgroundColor(btn_color_ap)
                binding.btn35.setBackgroundColor(btn_color_ap)

                btn_5 = false
                btn_15 = false
                btn_25 = false
                btn_35 = false
            }
            binding.btn45.setBackgroundColor(Color.BLACK)
            btn_45 = true
        }

        binding.btnAddEtiqueta.setOnClickListener{
            startActivity(Intent(this, AvisoWebPomodoro::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        binding.btnAddTime.setOnClickListener {
            time +=1
            binding.txtTiempo.setText(time.toString()+"m")
        }

        binding.btnRestTime.setOnClickListener {
            time -=1
            if(time < 0){
                time = 0
            }
            binding.txtTiempo.setText(time.toString()+"m")
        }

        binding.btnIniciarPomodoro.setOnClickListener{
            startActivity(Intent(this, PomodoroIniciado::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        binding.btnIniciarPomodoro2.setOnClickListener{
            startActivity(Intent(this, PomodoroIniciado::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        binding.btnA.setOnClickListener{
            if(etiqueta2 || etiqueta3){
                binding.btnB.setBackgroundColor(btn_color_ap)
                binding.btnC.setBackgroundColor(btn_color_ap)

                etiqueta2 = false
                etiqueta3 = false
            }
            binding.btnA.setBackgroundColor(Color.BLACK)
            etiqueta1 = true
        }

        binding.btnB.setOnClickListener{
            if(etiqueta1 || etiqueta3){
                binding.btnA.setBackgroundColor(btn_color_ap)
                binding.btnC.setBackgroundColor(btn_color_ap)

                etiqueta1 = false
                etiqueta3 = false
            }
            binding.btnB.setBackgroundColor(Color.BLACK)
            etiqueta2 = true
        }

        binding.btnC.setOnClickListener{
            if(etiqueta1 || etiqueta2){
                binding.btnA.setBackgroundColor(btn_color_ap)
                binding.btnB.setBackgroundColor(btn_color_ap)

                etiqueta1 = false
                etiqueta2 = false
            }
            binding.btnC.setBackgroundColor(Color.BLACK)
            etiqueta3 = true
        }
    }
}