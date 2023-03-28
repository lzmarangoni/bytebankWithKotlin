fun testaCopiaseReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroY)

    val contaJoao = Conta(titular = "Maria", numeroDaConta = 1587)


    val contaMaria = contaJoao
    contaMaria.titular ="João"

    println(contaJoao.titular)
    println(contaMaria.titular)
}