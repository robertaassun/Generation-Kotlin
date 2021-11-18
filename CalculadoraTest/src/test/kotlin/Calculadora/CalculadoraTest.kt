package Calculadora

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    var calculadora = Calculadora()

    @org.junit.jupiter.api.Test
    fun soma() {
        assertEquals(10,calculadora.soma(4,6))
    }

    @org.junit.jupiter.api.Test
    fun subtracao() {
        kotlin.test.assertEquals(8, calculadora.subtracao(10, 2))
    }

    @org.junit.jupiter.api.Test
    fun multiplicacao() {
        kotlin.test.assertEquals(25, calculadora.multiplicacao(5, 5))
    }

    @org.junit.jupiter.api.Test
    fun divisao() {
        kotlin.test.assertEquals(2, calculadora.divisao(4, 2))
    }
}
