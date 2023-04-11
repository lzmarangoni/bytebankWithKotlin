class Gerente(
     nome: String ,
     matricula: Int ,
     salario: Double,
    val senha: Int
): Funcionario(nome=nome, matricula=matricula, salario=salario) {

  //  fun bonificacao(): Double {
  //      return salario * 0.2
  //  }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha

    }
}