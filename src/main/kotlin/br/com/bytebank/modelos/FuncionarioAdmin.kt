package br.com.bytebank.modelos

import br.com.bytebank.modelos.Funcionario

abstract class FuncionarioAdmin(
    nome: String ,
    matricula: Int ,
    salario: Double ,
    protected val senha: Int

): Funcionario(nome = nome, matricula = matricula , salario = salario) {
    fun autentica (senha: Int): Boolean{
        return if(this.senha == senha) {
            true
        } else{
            false
        }
    }
}
