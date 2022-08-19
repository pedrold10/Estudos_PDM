package com.example.geraldinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etQuantidade: EditText
    private lateinit var btGerar: Button
    private lateinit var tvNumeros: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etQuantidade = findViewById(R.id.etQuantidade)
        this.btGerar = findViewById(R.id.btGerar)
        this.tvNumeros = findViewById(R.id.tvNumeros)

        this.etQuantidade.setText("6")
        this.tvNumeros.text = Gerador().gerar(6)

        /*
        this.btGerar.setOnClickListener{ FORMA 1
            var qtde = this.etQuantidade.text.toString().toInt()
            this.tvNumeros.text = Gerador().gerar(amount= qtde)
        }
          */

       // this.btGerar.setOnClickListener{ gerarNumeros() } FORMA 2

        // Forma 3

        this.btGerar.setOnClickListener(ClickBotao())
        }
    fun gerarNumeros(){
        var qtde = this.etQuantidade.text.toString().toInt()
        this.tvNumeros.text = Gerador().gerar(amount= qtde)
    }
    inner class ClickBotao: View.OnClickListener{
        override fun onClick(v: View?) {
            var qtde = this@MainActivity.etQuantidade.text.toString().toInt()
            this@MainActivity.tvNumeros.text = Gerador().gerar(qtde)
        }

    }
}
