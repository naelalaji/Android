package com.eni.mod4findeviewbyid

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView= findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        textView.text ="Hello"
        editText.hint="Comment allez vous ?"
        editText.text.clear()
        ratingBar.rating=3.0f


        //Récuperation des instances de mes boutons
        val button=findViewById<Button>(R.id.button)
        val button2=findViewById<Button>(R.id.button2)

        button.setOnClickListener{
            Toast.makeText(this,"hello tu as appuyé sur un boutton",Toast.LENGTH_SHORT).show()

        }
//        //pour récupérer le contenu d'un EditText
//        editText.text.toString().toInt()
    }

     fun onClickButton2(v:View){
         Toast.makeText(this,"un 2ème boutton",Toast.LENGTH_SHORT).show()
     }
}