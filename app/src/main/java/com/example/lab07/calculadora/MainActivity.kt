package com.example.lab07.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.lab07.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val prac1 = findViewById<EditText>(R.id.practica_note)
        val prac2 = findViewById<EditText>(R.id.practica_note_2)

        val lab1 = findViewById<EditText>(R.id.laboratorio_note)
        val lab2 = findViewById<EditText>(R.id.laboratorio_note_2)
        val lab3 = findViewById<EditText>(R.id.laboratorio_note_3)
        val lab4 = findViewById<EditText>(R.id.laboratorio_note_4)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        val prom1 = findViewById<TextView>(R.id.result_prom1)
        val prom2 = findViewById<TextView>(R.id.result_prom2)
        val prom3 = findViewById<TextView>(R.id.result_prom3)

        val spinner = findViewById<Spinner>(R.id.porcentaje)
        val seleccionado = spinner.selectedItemPosition

        btnCalcular.setOnClickListener{
            val num1 = prac1.text.toString().toDouble()
            val num2 = prac2.text.toString().toDouble()
            val num3 = lab1.text.toString().toDouble()
            val num4 = lab2.text.toString().toDouble()
            val num5 = lab3.text.toString().toDouble()
            val num6 = lab4.text.toString().toDouble()

            val promedio = viewModel.calcularPromedio(num1, num2)
            val promedio2 = viewModel.calcularPromedio2(num3, num4, num5, num6)
            val promedio3 = viewModel.calcularPromedio3(promedio, promedio2, seleccionado)
            prom1.text = "$promedio"
            prom2.text = "$promedio2"
            prom3.text = "$promedio3"

        }

    }
}