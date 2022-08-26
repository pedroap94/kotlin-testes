package com.pedro.testeskotlin.abstraction

import java.math.BigDecimal

interface CalculoInterface {
    fun calcularPrecoPedido()
    fun total(): BigDecimal
}