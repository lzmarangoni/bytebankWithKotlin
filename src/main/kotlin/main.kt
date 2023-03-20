fun main(){
    println("bem vindo ao bytebank")
    var i =0
    while (i < 5) {
        val titular: String = "Luiz $i"
        val contaCorrente: Int = 1234 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Conta Corrente: $contaCorrente")
        println("Saldo: $saldo")
        testandoCondicoes(saldo)
        println()
        i++

    }
}




fun testandoCondicoes(saldo: Double){
    when {
        saldo > 0.0 -> println("saldo positivo")
        saldo == 0.0 -> println("sem saldo")
        else -> println("conta negativa")
    }

}