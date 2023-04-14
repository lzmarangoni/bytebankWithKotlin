class Diretor(
     nome: String ,
     matricula: Int ,
     salario: Double,
    val senha: Int,
    val plr: Double
): Funcionario(nome=nome, matricula=matricula, salario=salario) {

    override val bonificacao: Double get()  =  super.bonificacao + salario + plr


    fun autentica(senha: Int): Boolean {
        return this.senha == senha

    }
}