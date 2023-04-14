fun main(){
    println("bem vindo ao bytebank")

    val contaPoupanca = ContaPoupança(titular = "Luiz" , numeroDaConta = 1000)
    val contaCorrente = ContaCorrente(titular = "Luiz" , numeroDaConta = 1001)

    contaPoupanca.deposita(valor = 1000.00)
    contaCorrente.deposita(valor = 1000.00)

    println("saldo da conta poupança é de ${contaPoupanca.saldo}")
    println("saldo da conta corrente é de ${contaCorrente.saldo}")

    contaPoupanca.sacar(valor = 10.00)
    contaCorrente.sacar(valor = 995.00)

    println(contaPoupanca.saldo)
    println(contaCorrente.saldo)
}






