package br.com.bytebank.modelos

import br.com.bytebank.modelos.Conta

abstract class ContaTransferivel(
     titular: Cliente ,
     numeroDaConta: Int
): Conta(titular = titular, numeroDaConta = numeroDaConta){
        fun transferencia(valor: Double, destino: Conta): Boolean{
        if (this.saldo >= valor){
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}