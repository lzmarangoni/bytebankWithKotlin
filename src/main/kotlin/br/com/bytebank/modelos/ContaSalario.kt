package br.com.bytebank.modelos

import br.com.bytebank.modelos.Conta

class ContaSalario(titular:Cliente , numeroDaConta:Int): Conta(numeroDaConta = numeroDaConta, titular = titular) {
    override fun sacar(valor: Double) {

        if (this.saldo >= valor){
            this.saldo -= valor
            println("saque concluido, seu novo saldo é de ${this.saldo}")
        }else{
            println("você não possui saldo suficiente, faça um saque de até ${this.saldo}")
        }
    }
}