package com.example.semanashow

import java.util.*

class VerDiaDaSemana(var dia: String, var mes: String, var ano: String) {
    fun diaDaSemana(): String{
        var calendario = Calendar.getInstance()
        var dias = arrayOf("", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado")
        calendario.set(ano, mes, dia)
        var day = calendario.get(Calendar.DAY_OF_WEEK)
        return dias[day]
    }
}


