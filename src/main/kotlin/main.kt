fun main(){
    println("bem vindo ao bytebank")

    testaComportamentosConta()
    var funcionario1 = Funcionario(
        "Marangoni",
        123,
        1300.00
    )
    println("Funcionario: ${funcionario1.nome}")
    println("Matricula: ${funcionario1.matricula}")
    println("Salário: ${funcionario1.salario}")
    println("O valor da sua bonificação é ${funcionario1.bonificacao()}")

}






