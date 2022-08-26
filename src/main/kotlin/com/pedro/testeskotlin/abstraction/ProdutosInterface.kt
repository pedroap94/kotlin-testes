package com.pedro.testeskotlin.abstraction

interface ProdutosInterface {
    fun obterProduto(nameProdutos:List<String>): MutableList<ProdutosInterface>
    fun settarPedido(pedido: Int)
}