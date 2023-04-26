package br.com.bytebank.testes

import br.com.bytebank.modelos.Cliente
import br.com.bytebank.modelos.ContaCorrente
import br.com.bytebank.modelos.ContaPoupanca
import br.com.bytebank.modelos.ContaSalario

fun testaComportamentosConta() {

    var clienteLuiz = Cliente(nome = "Luiz", cpf = 1 , senha = 1)
    var contaLuiz = ContaCorrente(clienteLuiz, numeroDaConta = 1001)
    contaLuiz.deposita(60.00)
    var clienteLeticia = Cliente(nome = "Leticia", cpf = 2 , senha = 2)
    var contaLeticia = ContaPoupanca(clienteLeticia, 1002)
    contaLeticia.deposita(50.00)
    var clienteJoao = Cliente(nome = "Joao", cpf = 3, senha = 3)
    var contaJoao = ContaSalario(titular = clienteJoao , numeroDaConta = 1003)

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