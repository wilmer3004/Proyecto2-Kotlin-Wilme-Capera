package com.wilmer3004.miprimerapp2

import kotlin.random.Random

object Saldo {
    var saldo: Double = 0.0
    var codigoRetiro:Int = 0


    fun consignarSaldo(valorconsignacion:Double){
        this.saldo+=valorconsignacion
    }

    fun retirarSaldo():Int{
        this.codigoRetiro = Random.nextInt(100000, 999999)
        return this.codigoRetiro
    }

    fun consultarSaldo():Double{
        return this.saldo
    }

    fun enviarDinero(valorEnvio:Double):Boolean{
        return if(valorEnvio<=this.saldo){
            this.saldo-=valorEnvio
            true
        } else{
            false
        }
    }

}