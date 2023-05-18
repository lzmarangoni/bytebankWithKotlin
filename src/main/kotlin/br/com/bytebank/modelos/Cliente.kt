package br.com.bytebank.modelos

import Autenticavel

class Cliente(
    var nome: String ,
    val cpf: Int ,
    val senha: Int,
    val endereço: Endereço = Endereço()
): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }else {
            return false
        }
    }
}