package br.com.bytebank.modelos

abstract class Funcionario(val nome:String ,
                           val matricula:Int ,
                           val salario:Double) {

    abstract val bonificacao: Double

}
