package com.example.lab07.calculadora

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val promedioRepository = MainRepository()

    fun calcularPromedio(numero1: Double, numero2: Double): Double {
        return promedioRepository.calcularPromedio(numero1, numero2)
    }

    fun calcularPromedio2(numero1: Double, numero2: Double, numero3: Double, numero4: Double): Double {
        return promedioRepository.calcularPromedio2(numero1, numero2, numero3, numero4)
    }

    fun calcularPromedio3(numero1: Double, numero2: Double, indice: Int): Double {
        return promedioRepository.calcularPromedio3(numero1, numero2, indice)
    }

}