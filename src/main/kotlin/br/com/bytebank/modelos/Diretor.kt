package br.com.bytebank.modelos

import Autenticavel

class Diretor(
     nome: String ,
     matricula: Int ,
     salario: Double,
    senha: Int,
    val plr: Double
): FuncionarioAdmin(nome=nome, matricula=matricula, salario=salario, senha =senha), Autenticavel {

    override val bonificacao: Double get()  =   salario + (salario* .10) + plr



}