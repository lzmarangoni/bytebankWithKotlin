open class Funcionario(val nome:String,
                  val matricula:Int,
                  val salario:Double) {

    fun bonificacao(): Double {
        return salario * 0.1
    }
}
