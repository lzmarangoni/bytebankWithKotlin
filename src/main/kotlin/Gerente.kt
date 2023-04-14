class Gerente(
     nome: String ,
     matricula: Int ,
     salario: Double,
    val senha: Int
): Funcionario(nome=nome, matricula=matricula, salario=salario) {

    override val bonificacao: Double get()  =  super.bonificacao + salario

    fun autentica(senha: Int): Boolean {
        return this.senha == senha

    }
}