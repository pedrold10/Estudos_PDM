package com.example.uiarrocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import com.example.uiarrocha.R
import com.example.uiarrocha.Status

class MainActivity : AppCompatActivity() {
    private lateinit var etNumero: EditText
    private lateinit var btArrocha: Button
    private lateinit var arrocha: Arrocha


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // criar novo jogo
        this.arrocha = Arrocha()

        this.etNumero = findViewById(R.id.etNumero)
        this.btArrocha = findViewById(R.id.btArrocha)


        this.btArrocha.setOnClickListener(OnClickBotao())

    }


    inner class OnClickBotao: View.OnClickListener{
        override fun onClick(p0: View?) {
            var numero = this@MainActivity.etNumero.text.toString().toInt()
            var dica = this@MainActivity.arrocha.jogar(numero)

            if (this@MainActivity.arrocha.getStatus() == Status.GANHOU){
                Toast.makeText(this@MainActivity, dica, Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this@MainActivity, ResultActivity::class.java)
                intent.putExtra("JOGO", this@MainActivity.arrocha)
                startActivity(intent)
                this@MainActivity.arrocha = Arrocha()
            }


            this@MainActivity.etNumero.setText("")

            //var msg = "Seu número é ${numero}"
            //Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
    }
}