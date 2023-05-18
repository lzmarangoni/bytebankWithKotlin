package br.com.bytebank.modelos

class ContaCorrente(
    titular: Cliente ,
    numeroDaConta: Int
) : ContaTransferivel(
    titular ,
    numeroDaConta
){
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 6.90
        if (saldo < valorComTaxa) {
            println("Seu saldo é insuficiente para sacar, pois alem do valor de saque cobramos uma taxa de R$6,90")
        } else {
             this.saldo -= valorComTaxa
        }
    }
}