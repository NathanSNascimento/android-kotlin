package com.example.caracoroa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Bundle = intent.extras
        val numSorteado = dados.getInt("numero")

        if (numSorteado == 1 ){
            image_result.setImageResource(R.drawable.moeda_cara)
        }else{
            image_result.setImageResource(R.drawable.moeda_coroa)
        }

        button_voltar.setOnClickListener {

            finish()
        }
    }
}
