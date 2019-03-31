package com.example.nathanconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_empresa.setOnClickListener {

            val intent = Intent(this, EmpresaActivity::class.java)

            startActivity(intent)

        }

        button_clientes.setOnClickListener {

            Toast.makeText( this, "Cliente Clicado", Toast.LENGTH_LONG).show()

            val intent = Intent(this, ClienteActivity::class.java)

            startActivity(intent)

        }

        button_servicos.setOnClickListener {

            val intent = Intent(this, ServicosActivity::class.java)

            startActivity(intent)

        }

        button_contato.setOnClickListener {

            val intent = Intent(this, ContatoActivity::class.java)

            startActivity(intent)

        }


    }
}
