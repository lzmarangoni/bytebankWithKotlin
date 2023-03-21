fun main(){
    println("bem vindo ao bytebank")

    var contaLuiz = Conta()
    contaLuiz.titular = "Luiz"
    contaLuiz.numeroDaConta = 1
    contaLuiz.saldo = 1.0
    println(contaLuiz.titular)
    println(contaLuiz.numeroDaConta)
    println(contaLuiz.saldo)

    deposita(contaLuiz, 520.00)
}
fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
    println("foi depositado o valor de ${valor} na conta ${conta.titular}, seu novo saldo é de ${conta.saldo}")
}

class Conta{
    var titular = "padrão"
    var numeroDaConta = 1234
    var saldo = 0.0
}

fun testaCopiaseReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroY)

    val contaJoao = Conta()
    contaJoao.titular = "Luiz"

    val contaMaria = contaJoao
    contaMaria.titular ="João"

    println(contaJoao.titular)
    println(contaMaria.titular)
}

fun testandoRepeticoes(){
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

