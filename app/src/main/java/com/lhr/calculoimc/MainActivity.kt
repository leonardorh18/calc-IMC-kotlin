package com.lhr.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = calcular
        val txtResultado: TextView = resultado

        btnCalcular.setOnClickListener(View.OnClickListener {

            val radioId = radioGroup.checkedRadioButtonId
            val gender = resources.getResourceEntryName(radioId)
            if (peso.text.isNotEmpty() && altura.text.isNotEmpty()){

                val peso = peso.text.toString().toDouble()
                val altura = altura.text.toString().toDouble()
                var res = peso / (altura * altura)
                res = Math.round(res * 10.0) / 10.0
                println("--------------" + res)
                if (gender.toString() == "male"){

                    if (res < 20.7){

                        txtResultado.setText("IMC: "+ res + "\n" + "Abaixo do peso")
                    } else if ( res >= 20.7 && res <= 26.4) {

                        txtResultado.setText("IMC: "+ res + "\n" + "Peso ideal")

                    }else if (res > 26.5 && res <= 27.8){

                        txtResultado.setText("IMC: "+ res+ "\n" + "Pouco acima do peso")

                    } else if (res > 27.9 && res <= 31.1){

                        txtResultado.setText("IMC: "+ res + "\n" + "Acima do peso")

                    }  else {

                        txtResultado.setText("IMC: "+ res + "\n" + "Obesidade")
                    }


                } else {

                    if (res < 19.1){

                        txtResultado.setText("IMC: "+ res + "\n" + "Abaixo do peso")
                    } else if ( res > 19.1 && res <= 25.8) {

                        txtResultado.setText("IMC: "+ res + "\n" + "Peso ideal")

                        }else if (res > 25.8 && res <= 27.3){

                        txtResultado.setText("IMC: "+ res+ "\n" + "Pouco acima do peso")

                        } else if (res > 27.3 && res <= 32.3){

                        txtResultado.setText("IMC: "+ res + "\n" + "Acima do peso")

                        }  else {

                        txtResultado.setText("IMC: "+ res + "\n" + "Obesidade")
                    }
                }

            }





        })

    }
}