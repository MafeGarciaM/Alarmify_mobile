package com.andes.alarmify_mobile

import android.R
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.andes.alarmify_mobile.databinding.ActivityCreateAlarmBinding
import com.andes.alarmify_mobile.databinding.ActivityMainBinding

class CreateAlarm : AppCompatActivity() {

    var btn_am = false
    var btn_pm = false

    var btn_lun = false
    var btn_mar = false
    var btn_mie = false
    var btn_jue = false
    var btn_vie = false
    var btn_sab = false
    var btn_dom = false

    var btn_color_ap = Color.parseColor("#5E59517B")
    var btn_color_day = Color.parseColor("#9E59517B")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityCreateAlarmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right)
        }

        binding.btnSaveAlarm.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right)
            Toast.makeText(this,"Alarma Creada", Toast.LENGTH_SHORT).show()
        }

        binding.btnAm.setOnClickListener{
            if(btn_pm){
                binding.btnPm.setBackgroundColor(btn_color_ap)
                btn_pm = false
            }
            binding.btnAm.setBackgroundColor(Color.BLACK)
            btn_am = true
        }

        binding.btnPm.setOnClickListener{
            if(btn_am){
                binding.btnAm.setBackgroundColor(btn_color_ap)
                btn_am = false
            }
            binding.btnPm.setBackgroundColor(Color.BLACK)
            btn_pm = true
        }

        binding.btnLun.setOnClickListener{
            btn_lun = if(btn_lun){
                binding.btnLun.setBackgroundColor(btn_color_day)
                false
            }else{
                binding.btnLun.setBackgroundColor(Color.BLACK)
                true
            }
        }

        binding.btnMar.setOnClickListener{
            btn_mar = if(btn_mar){
                binding.btnMar.setBackgroundColor(btn_color_day)
                false
            }else{
                binding.btnMar.setBackgroundColor(Color.BLACK)
                true
            }
        }

        binding.btnMie.setOnClickListener{
            btn_mie = if(btn_mie){
                binding.btnMie.setBackgroundColor(btn_color_day)
                false
            }else{
                binding.btnMie.setBackgroundColor(Color.BLACK)
                true
            }
        }

        binding.btnJue.setOnClickListener{
            btn_jue = if(btn_jue){
                binding.btnJue.setBackgroundColor(btn_color_day)
                false
            }else{
                binding.btnJue.setBackgroundColor(Color.BLACK)
                true
            }
        }

        binding.btnVie.setOnClickListener{
            btn_vie = if(btn_vie){
                binding.btnVie.setBackgroundColor(btn_color_day)
                false
            }else{
                binding.btnVie.setBackgroundColor(Color.BLACK)
                true
            }
        }

        binding.btnSab.setOnClickListener{
            btn_sab = if(btn_sab){
                binding.btnSab.setBackgroundColor(btn_color_day)
                false
            }else{
                binding.btnSab.setBackgroundColor(Color.BLACK)
                true
            }
        }

        binding.btnDom.setOnClickListener{
            btn_dom = if(btn_dom){
                binding.btnDom.setBackgroundColor(btn_color_day)
                false
            }else{
                binding.btnDom.setBackgroundColor(Color.BLACK)
                true
            }
        }

        binding.btnSonido.setOnClickListener{
            startActivity(Intent(this, AvisoExterno::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        binding.btnImg.setOnClickListener{
            startActivity(Intent(this, AvisoExterno::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        binding.btnEvento.setOnClickListener{
            startActivity(Intent(this, AvisoExterno ::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        binding.btnRecord.setOnClickListener{
            startActivity(Intent(this, AvisoWeb::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}