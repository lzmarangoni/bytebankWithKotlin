fun testaComportamentosConta() {
    var contaLuiz = ContaCorrente("Luiz", numeroDaConta = 1001)
    contaLuiz.deposita(60.00)
    var contaLeticia = ContaPoupanca("Leticia", 1002)
    contaLeticia.deposita(50.00)
    var contaJoao = ContaSalario("Joao", 1003)

    contaLeticia.transferencia( 50.0, contaJoao)
    println(contaJoao.saldo)

    if (contaLuiz.transferencia(50.00, contaLeticia)) {
        println("transferencia concluida")
        println("seu novo saldo é de ${contaLuiz.saldo}")
        println("Saldo da conta que recebeu o dinheiro é de ${contaLeticia.saldo}")
    } else {
        println("mal sucedida")
    }
}