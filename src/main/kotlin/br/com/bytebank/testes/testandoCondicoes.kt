package br.com.bytebank.testes

fun testandoCondicoes(saldo: Double){
    when {
        saldo > 0.0 -> println("saldo positivo")
        saldo == 0.0 -> println("sem saldo")
        else -> println("conta negativa")
    }

}