package com.example.uiarrocha

import java.util.*
import javax.net.ssl.SSLEngineResult
import kotlin.random.Random

abstract class Arrocha {
    private var maior: Int
    private var menor: Int
    private var secreto: Int
    private var status: Status

    init{
        var random = Random(Calendar.getInstance().timeInMillis)
        this.menor= 2
        this.maior= 99
        this.secreto= random.nextInt(this.menor+1, this.menor-1)
        this.status = Status.EXECUTANDO
    }
    fun jogar(chute: Int): String?{
        var msg = ""
        if(this.status != Status.EXECUTANDO){
            if ((chute == this.secreto) || this.validaIntervalo(chute))
                this.status = Status.PERDEU
            else{
                if(chute < this.secreto){
                    msg = "O número é menor do que o secreto"
                    this.menor = chute
                }
                else {
                    msg = "O número é maior do que o secreto"
                    this.maior = chute
                }
                if(this.isArrochado()){
                    this.status = Status.GANHOU
                }
                else{
                    return msg
                }
            }
        }
        return null
    }
    private fun validaIntervalo(chute: Int): Boolean{
        return chute > this.menor && chute < this.maior
    }
    fun isArrochado(): Boolean{
        return menor + 1 == maior - 1
    }
}