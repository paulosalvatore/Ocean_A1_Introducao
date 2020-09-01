package com.oceanbrasil.ocean_a1_introducao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Exemplo 1
//         tvNome.text = "Seu nome"

        // Exemplo 2
//        btAtualizar.setOnClickListener {
//            tvNome.text = "Seu nome"
//        }

        // Exemplo 3
//        btAtualizar.setOnClickListener {
//            tvNome.text = etNome.text.toString()
//        }

        // Exemplo 4
//        btAtualizar.setOnClickListener {
//            if (etNome.text.isBlank()) {
//                etNome.error = "Digite um nome válido."
//            } else {
//                tvNome.text = etNome.text.toString()
//            }
//        }

        // Exemplo 5
//        btLimpar.setOnClickListener {
//            etNome.text.clear()
//            tvNome.text = "Mensagem de Placeholder"
//        }
    }
}
