package br.com.bytebank.modelos

class Analista(
     nome: String ,
     matricula: Int ,
     salario: Double,

): Funcionario(nome=nome, matricula=matricula, salario=salario) {

    override val bonificacao: Double get()  = salario * 0.10


}

