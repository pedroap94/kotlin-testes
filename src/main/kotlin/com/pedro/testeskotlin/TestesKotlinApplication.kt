package com.pedro.testeskotlin

import com.pedro.testeskotlin.model.Pessoa
import com.pedro.testeskotlin.service.PessoaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestesKotlinApplication
@Autowired
private var pessoaService: PessoaService = PessoaService(Pessoa("João", 22));

fun main(args: Array<String>) {
    runApplication<TestesKotlinApplication>(*args)
    pessoaService.testesLateInit()
}
