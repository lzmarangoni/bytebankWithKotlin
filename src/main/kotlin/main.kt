fun main(){
    println("bem vindo ao bytebank")

    var contaLuiz = Conta("Luiz", 1001)

    contaLuiz.deposita(1.0)


    contaLuiz.deposita( -1.00)
    contaLuiz.sacar(50.00)

    var contaLeticia = Conta("Leticia", 1002)

    if(contaLuiz.tranferencia(50.00, contaLeticia)){
        println("concluido")
    } else {
        println("mal sucedida")
    }

    println(contaLeticia.saldo)
}


class Conta(var titular:String, var numeroDaConta: Int){
 
    var saldo = 0.0
        private set

//    constructor(titular:String, numeroDaConta: Int){
//        this.titular = titular
//        this.numeroDaConta = numeroDaConta
//    }

        fun deposita(valor: Double){
            if(valor > 0){
                this.saldo += valor
                println("foi depositado o valor de ${valor} para a conta do ${titular}, seu novo saldo é de ${saldo}")
            }else{
                println("Valor de deposito deve ser maior que 0, e valor informado foi ${valor}")
            }

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

}

//fun testaCopiaseReferencias(){
//    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//    println(numeroY)
//
//    val contaJoao = Conta()
//    contaJoao.titular = "Luiz"
//
//    val contaMaria = contaJoao
//    contaMaria.titular ="João"
//
//    println(contaJoao.titular)
//    println(contaMaria.titular)
//}

//fun testandoRepeticoes(){
//    var i =0
//    while (i < 5) {
//        val titular: String = "Luiz $i"
//        val contaCorrente: Int = 1234 + i
//        var saldo: Double = 0.0 + i
//
//        println("Titular: $titular")
//        println("Conta Corrente: $contaCorrente")
//        println("Saldo: $saldo")
//        testandoCondicoes(saldo)
//        println()
//        i++
//
//    }
//
//
//}
//
//fun testandoCondicoes(saldo: Double){
//    when {
//        saldo > 0.0 -> println("saldo positivo")
//        saldo == 0.0 -> println("sem saldo")
//        else -> println("conta negativa")
//    }
//
//}

