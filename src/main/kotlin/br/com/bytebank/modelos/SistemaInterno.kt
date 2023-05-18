package br.com.bytebank.modelos

import Autenticavel

class SistemaInterno {

    fun entra(funcionario: Autenticavel , senha:Int){
        if(funcionario.autentica(senha)){
            println("Bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação")
        }
    }
}