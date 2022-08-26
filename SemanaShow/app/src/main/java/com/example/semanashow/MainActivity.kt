package com.example.semanashow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etAno: EditText

    private lateinit var etMes: EditText

    private lateinit var etDia: EditText


    private lateinit var BtVer: Button

    private lateinit var tvDia: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etAno = findViewById(R.id.etAno)
        this.etDia = findViewById(R.id.etDia)
        this.etMes = findViewById(R.id.etMes)

        this.BtVer = findViewById(R.id.BtVer)
        this.tvDia = findViewById(R.id.tvDia)


        this.BtVer.setOnClickListener(ClickBotao())
    }
    inner class ClickBotao: View.OnClickListener{
        override fun onClick(p0: View?){
            var dia = this@MainActivity.etDia.text.toString().toInt()
            var mes = this@MainActivity.etMes.text.toString().toInt()
            var ano = this@MainActivity.etAno.text.toString().toInt()
            this@MainActivity.tvDia.text = VerDiaDaSemana(dia, mes, ano).diaDaSemana()

        }
    }
}