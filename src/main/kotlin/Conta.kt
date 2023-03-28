class Conta(
    var titular:String,
    var numeroDaConta: Int){

    var saldo = 0.0
        private set

     fun deposita(valor: Double){
            if(valor > 0){
                this.saldo += valor
                println("foi depositado o valor de ${valor} para a conta do ${titular}, seu novo saldo é de ${saldo}")
            }else{
                println("Valor de deposito deve ser maior que 0, e valor informado foi ${valor}")
            }

        }

    fun sacar(valor: Double){
        if (this.saldo >= valor){
            this.saldo -= valor
            println("você sacou ${valor}, seu novo saldo é de ${this.saldo}")
        }else{
            println("você não possui saldo suficiente, faça um saque de até ${this.saldo}")
        }
    }

    fun tranferencia(valor: Double, destino: Conta): Boolean{
        if (this.saldo >= valor){
           this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

}