package com.example.uiarrocha

class Arrocha {
    private var maior: Int
    private var menor: Int
    private var secreto: Int

    init{
        this.menor=2
        this.maior= 99
        this.secreto= -1
    }
    fun jogar(chute:Int) <??>{

    }
    fun isArrochado(): Boolean{
        return menor + 1 == maior - 1
    }
}