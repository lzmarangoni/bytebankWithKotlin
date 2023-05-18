package br.com.bytebank.testes

import br.com.bytebank.modelos.Cliente
import br.com.bytebank.modelos.Diretor
import br.com.bytebank.modelos.Gerente
import br.com.bytebank.modelos.SistemaInterno


fun testaAutentica() {


    val gerenteAdm = Gerente(nome = "Luiz" , matricula = 1899 , salario = 3000.00 , senha = 1462)
    gerenteAdm.autentica(10)


    val diretorComum = Diretor(nome = "Jose" , matricula = 1 , salario = 10000.00 , senha = 1234 , plr = 400.0)
    diretorComum.autentica(1234)

    val cliente = Cliente("teste", 1234, 123)



    val sistema = SistemaInterno()

    sistema.entra(diretorComum,1234)
    sistema.entra(cliente, 123)




}