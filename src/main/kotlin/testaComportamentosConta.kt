fun testaComportamentosConta() {
    var contaLuiz = ContaCorrente("Luiz", 1001)
    contaLuiz.deposita(60.00)
    var contaLeticia = ContaPoupança("Leticia", 1002)


    if (contaLuiz.tranferencia(50.00, contaLeticia)) {
        println("concluido")
        println(contaLuiz.saldo)
        println(contaLeticia.saldo)
    } else {
        println("mal sucedida")
    }
}