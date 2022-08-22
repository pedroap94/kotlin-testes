package com.pedro.testeskotlin.model

data class Pessoa (var nome:String, var idade:Int){
    lateinit var apelido: String

    fun pessoaInitialized():Boolean{
        return this::apelido.isInitialized;
    }
}