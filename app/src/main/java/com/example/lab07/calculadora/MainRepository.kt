package com.example.lab07.calculadora

import kotlin.math.round

class MainRepository {
    fun calcularPromedio(numero1: Double, numero2: Double): Double {
        return (numero1 + numero2) / 2
    }
    fun calcularPromedio2(numero1: Double, numero2: Double, numero3: Double, numero4: Double): Double {
        return (numero1 + numero2 + numero3 + numero4) / 4
    }
    fun calcularPromedio3(numero1: Double, numero2: Double, indice: Int): Double {
        return when (indice) {
            0 -> round(numero1 * 0.3 + numero2 * 0.7) // A: 30% T + 70% L
            1 -> round(numero1 * 0.7 + numero2 * 0.3) // A: 70% T + 30% L
            else -> throw IllegalArgumentException("Índice de spinner no válido")
        }
    }
}