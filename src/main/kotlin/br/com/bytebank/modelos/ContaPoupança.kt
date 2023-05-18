package br.com.bytebank.modelos

class ContaPoupanca(
    titular: Cliente ,
    numeroDaConta: Int
) : ContaTransferivel(
    titular ,
    numeroDaConta
) {
    override fun sacar(valor: Double) {

            if (this.saldo >= valor){
                this.saldo -= valor
                println("saque concluido, seu novo saldo é de ${this.saldo}")
            }else{
                println("você não possui saldo suficiente, faça um saque de até ${this.saldo}")
            }
        }

}