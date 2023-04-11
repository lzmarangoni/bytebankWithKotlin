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

    var gerente1 = Gerente(
        "Leticia",
        2,
        3000.00,
        1234)

    var diretor = Diretor(
        "Roberto",
        150,
        20000.0,
        1234,
        200.0
    )
    println("Funcionario: ${diretor.nome}")
    println("Matricula: ${diretor.matricula}")
    println("Salário: ${diretor.salario}")
    println("plr: ${diretor.plr}")
    println("senha: ${diretor.autentica(1234)}")
}






