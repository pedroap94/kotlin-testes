package com.pedro.testeskotlin.repository

import com.pedro.testeskotlin.model.Produto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProdutoRepository : JpaRepository<Produto, Long> {
    fun findByName(name: List<String>): MutableList<Produto>
}