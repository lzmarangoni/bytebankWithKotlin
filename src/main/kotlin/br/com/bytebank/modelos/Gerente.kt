package br.com.bytebank.modelos

import Autenticavel

class Gerente(
     nome: String ,
     matricula: Int ,
     salario: Double,
     senha: Int

): FuncionarioAdmin(nome=nome, matricula=matricula, salario=salario, senha = senha), Autenticavel {

    override val bonificacao: Double get()  =  salario + (salario * .20)


}