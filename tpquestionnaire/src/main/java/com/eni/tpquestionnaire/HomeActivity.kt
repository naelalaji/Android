package com.eni.tpquestionnaire

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eni.tpquestionnaire.databinding.HomeActivityBinding


class HomeActivity : AppCompatActivity() {
    lateinit var activityHomeBinding:HomeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)
        activityHomeBinding.playQuizHomeBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}