package com.eni.mod4databuilding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.eni.mod4databuilding.databinding.ActivityMainBinding
import io.github.serpro69.kfaker.faker

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        amb=DataBindingUtil.setContentView(this,R.layout.activity_main)

        val faker = faker { fakerConfig  { locale="fr"}}

        val user = Utilisateur(
            faker.name.lastName(),
            faker.name.firstName(),
            (1900..2000).random().toString(),
            faker.gender.types()

        )

        amb.utilisateur=user
        Toast.makeText(this,amb.utilisateur.toString(),Toast.LENGTH_SHORT).show()
        amb.textViewPrenom.textSize=25.0f
    }
}