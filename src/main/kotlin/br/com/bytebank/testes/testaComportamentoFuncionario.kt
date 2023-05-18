package br.com.bytebank.testes

import br.com.bytebank.modelos.Analista
import br.com.bytebank.modelos.Diretor
import br.com.bytebank.modelos.Gerente

fun testaComportamentoFuncionario() {
    testaComportamentosConta()
    var analista1 = Analista(
        "Marangoni" ,
        123 ,
        1000.00
    )
    println("modelos.Funcionario: ${analista1.nome}")
    println("Matricula: ${analista1.matricula}")
    println("Salário: ${analista1.salario}")
    println("O valor da sua bonificação é ${analista1.bonificacao}")

    var gerente1 = Gerente(
        "Leticia" ,
        2 ,
        2000.00 ,
        1234
    )

    var diretor = Diretor(
        "Roberto" ,
        150 ,
        10000.0 ,
        1234 ,
        200.0
    )
//    println("modelos.Funcionario: ${diretor.nome}")
//    println("Matricula: ${diretor.matricula}")
//    println("Salário: ${diretor.salario}")
//    println("plr: ${diretor.plr}")
//    println("senha: ${diretor.autentica(1234)}")

    println(analista1.bonificacao)
    println(gerente1.bonificacao)
    println(diretor.bonificacao)
gerente1.autentica(123)
//    val calculadora = modelos.CalculadoraBonificacao()
//
//    calculadora.registra(diretor)
//    calculadora.registra(gerente1)
//
//
//    println(calculadora.total)
//
//
//
//    calculadora.registra(analista1)

//    println(calculadora.total)


}