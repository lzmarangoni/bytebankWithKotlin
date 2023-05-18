package br.com.bytebank.testes

import br.com.bytebank.modelos.Cliente
import br.com.bytebank.modelos.ContaCorrente
import br.com.bytebank.modelos.ContaPoupanca
import br.com.bytebank.modelos.Endereço

fun testaContasDiferentes() {
    val clienteCC = Cliente(nome = "Luiz", cpf = 4, senha = 4, Endereço(logradouro = "Jurandir Paes Leme"))
    val clienteCP = Cliente(nome = "Luiz", cpf = 4, senha = 4)

    val contaCorrente = ContaCorrente(clienteCC, numeroDaConta = 1001)
    val contaPoupanca = ContaPoupanca(clienteCP, numeroDaConta = 1)

    contaPoupanca.deposita(valor = 1000.00)
    contaCorrente.deposita(valor = 1000.00)

    println("saldo da conta poupança é de ${contaPoupanca.saldo}")
    println("saldo da conta corrente é de ${contaCorrente.saldo}")

    contaPoupanca.sacar(valor = 10.00)
    contaCorrente.sacar(valor = 995.00)

    println(contaPoupanca.saldo)
    println(contaCorrente.saldo)

    contaPoupanca.transferencia(valor = 50.0 , destino = contaCorrente)

    println(contaPoupanca.saldo)
    println(contaCorrente.saldo)
    println(contaCorrente.titular.endereço.logradouro)
}

