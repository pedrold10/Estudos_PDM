package com.example.semanashow

import java.util.*

class VerDiaDaSemana(var dia: Int, var mes: Int, var ano: Int) {
    fun diaDaSemana(): String{
        var calendario = Calendar.getInstance()
        var dias = arrayOf("", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado")
        calendario.set(this.ano, this.mes - 1, this.dia)
        var day = calendario.get(Calendar.DAY_OF_WEEK)
        return dias[day]
    }
}


