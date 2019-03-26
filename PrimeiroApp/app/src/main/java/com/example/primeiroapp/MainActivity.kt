package com.example.primeiroapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView

    val frases= arrayOf(
        "Será que Deus pode me passar o código de fonte para eu melhorar o meu sistema?",

        "O meu computador não liga, o que eu faço? Dê o troco e não ligue pra ele também.",

        "Acho que o coração devia ter a opção apagar histórico.",

        "Aquele segundo em que você faz uma cagada, e você pensa que deveria existir Ctrl+Z na vida real.",

        "Se a vida fosse um cartão de memória, eu formatava e começaria tudo de novo."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.tvFrases)

    }

    fun gerarFrase(view: View){

        val totalItensArray = frases.size

        val numAleatorio = Random().nextInt(totalItensArray)

        texto.setText(frases [numAleatorio])

    }
}
