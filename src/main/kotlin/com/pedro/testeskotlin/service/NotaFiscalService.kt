package com.pedro.testeskotlin.service

import com.pedro.testeskotlin.abstraction.CalculoInterface
import java.math.BigDecimal

class NotaFiscalService {
    fun gerarNota(calculo: CalculoInterface): BigDecimal{
        return calculo.total();
    }
}