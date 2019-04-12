package com.example.alcoolgasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btCalcular(view: View){
        //recuperar valores
        //val precoAlcool = findViewById<EditText>(R.id.precoAlcool)

        val precoAlcool = edit_preco_alcool.text.toString()
        val precoGasolina = edit_preco_gasolina.text.toString()

        val validaCampo = validaCampo(precoAlcool, precoGasolina)

        if(validaCampo){
            calcularPreco(precoAlcool, precoGasolina)
        } else{
            textResultado.setText("Preencha os preços primeiro")
        }
    }

    fun validaCampo(precoAlcool:String, precoGasolina: String) : Boolean {

        var camposValidos:Boolean = true

        if(precoAlcool == null || precoAlcool.equals("")){
            camposValidos = false
        } else if(precoGasolina == null || precoGasolina.equals("")){

        }

        return camposValidos
    }

    fun calcularPreco(precoAlcool: String, precoGasolina: String){
        //Converter os valores de String para números

        val valorAlcool = precoAlcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        /*Faz calculo (precoAlcool / precoGasolina)
        * se resultado >= 0.7 melhor utilizar gasolina
        * senao melhor alcool
        */

        val resultadoPreco = valorAlcool / valorGasolina

        if(resultadoPreco >= 0.7){
            textResultado.setText("Melhor usar Gasolina!!")
        } else {
            textResultado.setText("Melhor usar Alcool!!")
        }



    }
}
