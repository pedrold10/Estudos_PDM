package com.example.uiarrocha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if(intent.hasExtra("JOGO")){
            val jogo = intent.getSerializableExtra("JOGO") as Arrocha
            Toast.makeText(this, jogo.getStatus().toString(), Toast.LENGTH_SHORT).show()
        }
    }
}