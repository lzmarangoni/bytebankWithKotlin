package br.com.bytebank.testes

import br.com.bytebank.modelos.Cliente
import br.com.bytebank.modelos.ContaCorrente

fun testaCopiaseReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroY)

    var joao = Cliente("joao", 1, 1)
    val contaJoao = ContaCorrente(joao, numeroDaConta = 1587)


    val contaMaria = contaJoao
    contaMaria.titular.nome ="João"

    println(contaJoao.titular)
    println(contaMaria.titular)
}