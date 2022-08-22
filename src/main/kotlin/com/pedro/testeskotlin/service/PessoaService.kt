package com.pedro.testeskotlin.service

import com.pedro.testeskotlin.model.Pessoa

class PessoaService (private var pessoa:Pessoa){

    fun testesLateInit(){
        println("meu nome é ${pessoa.nome}")
        if (pessoa.pessoaInitialized()){
            println("Mas pode me chamar de ${pessoa.apelido}")
        }
        pessoa.apelido = "Jão"
        println("Mas pode me chamar de ${pessoa.apelido}");
    }
}