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

        /*
        Desafio

        1. Criar uma nova Activity
        2. Adicionar um elemento de visualização de texto para exibição do resultado
        3. Adicionar dois elementos de edição de texto, um para o nome e outro para a idade
        4. Adicionar dois botões, um para enviar e outro para limpar
        5. Quando clicar no botão enviar, fazer uma validação se todos os campos foram digitados
        6. Se a validação passar, atualizar o elemento de visualização de texto para: "Olá NOME, você tem IDADE anos."
        7. Caso não passe, atualizar o elemento de edição de texto problemático com uma mensagem de erro
        8. Ao clicar no botão limpar, limpa todos os itens do formulário
        */
    }
}
