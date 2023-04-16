class Gerente(
     nome: String ,
     matricula: Int ,
     salario: Double,
     senha: Int
): FuncionarioAdmin(nome=nome, matricula=matricula, salario=salario, senha = senha) {

    override val bonificacao: Double get()  =  salario + (salario * .20)


}