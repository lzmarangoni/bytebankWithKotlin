package br.com.bytebank.testes

fun testandoRepeticoes(){
    var i =0
    while (i < 5) {
        val titular: String = "Luiz $i"
        val contaCorrente: Int = 1234 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("modelos.Conta Corrente: $contaCorrente")
        println("Saldo: $saldo")
        testandoCondicoes(saldo)
        println()
        i++

    }


}