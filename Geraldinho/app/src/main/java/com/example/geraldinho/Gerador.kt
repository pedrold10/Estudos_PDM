package com.example.geraldinho

import java.util.*

class Gerador {
    fun gerar(amount: Int): String{
        var lista = mutableSetOf
        var random = Random(Calendar.getInstance().timeInMillis)
        while(lista.size< amount){
            lista.add(random.nextInt(1, 61))
        }
    }
    return lista.toString()
}