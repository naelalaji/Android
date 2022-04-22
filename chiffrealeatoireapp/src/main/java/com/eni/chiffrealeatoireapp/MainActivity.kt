package com.eni.chiffrealeatoireapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numMin= findViewById<EditText>(R.id.NumberMin)
        val numMax= findViewById<EditText>(R.id.NumberMax)
        val btnGenerat= findViewById<Button>(R.id.btnGenerat)

        val res= findViewById<TextView>(R.id.res)




        btnGenerat.setOnClickListener{
            var nbMinimum= numMin.text.toString().toInt()
            var nbMaximum= numMax.text.toString().toInt()
            val randomValues = Random.nextInt(nbMinimum, nbMaximum)
            res.text=res.text.toString()+randomValues.toString()

            if (nbMinimum> nbMaximum){
                Toast.makeText(this,"Error de saissie",Toast.LENGTH_SHORT).show()
            }



        }

    }




}