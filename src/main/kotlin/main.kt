fun main(){
    println("bem vindo ao bytebank")

    var contaLuiz = Conta()
    contaLuiz.titular = "Luiz"
    contaLuiz.numeroDaConta = 1
    contaLuiz.setSaldo(1.0)
    println(contaLuiz.titular)
    println(contaLuiz.numeroDaConta)
    println(contaLuiz.getSaldo())

    contaLuiz.deposita( 520.00)
    contaLuiz.sacar(50.00)

    var contaLeticia = Conta()

    if(contaLuiz.tranferencia(50.00, contaLeticia)){
        println("concluido")
    } else {
        println("mal sucedida")
    }

    println(contaLeticia.getSaldo())
}


class Conta{
    var titular = "padrão"
    var numeroDaConta = 1234
    private var saldo = 0.0

    fun deposita(valor: Double){
        this.saldo += valor
        println("foi depositado o valor de ${valor} na conta ${this.titular}, seu novo saldo é de ${this.saldo}")
    }

    fun sacar(valor: Double){
        if (this.saldo >= valor){
            this.saldo -= valor
            println("você sacou ${valor}, seu novo saldo é de ${this.saldo}")
        }else{
            println("você não possui saldo suficiente, faça um saque de até ${this.saldo}")
        }
    }

    fun tranferencia(valor: Double, destino: Conta): Boolean{
        if (this.saldo >= valor){
           this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

        fun getSaldo(): Double{
            return saldo
        }

        fun setSaldo(valor: Double){
            saldo = valor
        }
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

