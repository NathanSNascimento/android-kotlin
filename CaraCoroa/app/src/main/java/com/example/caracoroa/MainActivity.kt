package com.example.caracoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_jogar.setOnClickListener {

            val intent = Intent(this, ResultadoActivity::class.java)

            val numSorteado = Random().nextInt(2);

            intent.putExtra("numero:", numSorteado)

            startActivity(intent)
        }
    }
}
