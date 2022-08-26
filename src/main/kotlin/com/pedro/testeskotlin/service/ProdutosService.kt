package com.pedro.testeskotlin.service

import com.pedro.testeskotlin.abstraction.ProdutosInterface
import com.pedro.testeskotlin.model.Produto
import com.pedro.testeskotlin.repository.ProdutoRepository

class ProdutosService(var pedido: Int, private val produtoRepository: ProdutoRepository) : ProdutosInterface {

    override fun obterProduto(nomeProdutos:List<String>): MutableList<Produto> {
        return produtoRepository.findByName(nomeProdutos);

    }

    override fun settarPedido(pedido: Int) {
        this.pedido = pedido;
    }
}