abstract class Conta(
    var titular:String,
    var numeroDaConta: Int
    ){

    open var saldo = 0.0
        protected set


    fun deposita(valor: Double){
            if(valor > 0){
                this.saldo += valor
                println("foi depositado o valor de ${valor} para a conta do ${titular}, seu novo saldo é de ${saldo}")
            }else{
                println("Valor de deposito deve ser maior que 0, e valor informado foi ${valor}")
            }

        }

    abstract fun sacar(valor: Double)

//    fun transferencia(valor: Double, destino: ContaNivel2): Boolean{
//        if (this.saldo >= valor){
//            this.saldo -= valor
//            destino.saldo += valor
//            return true
//        }
//        return false
//    }

}