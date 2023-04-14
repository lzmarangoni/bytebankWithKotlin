open class Funcionario(val nome:String,
                  val matricula:Int,
                  val salario:Double) {

    open val bonificacao: Double
        get() {
            return salario * 0.1
        }
}
