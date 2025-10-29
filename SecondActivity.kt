package com.hyomin.termproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        var buttonReturn = findViewById<Button>(R.id.btnReturn)

        buttonReturn.setOnClickListener{
            val page = Intent(applicationContext, FourthActivity::class.java)
            startActivity(page)

        }

        var btnWeb = findViewById<Button>(R.id.btnWeb)

        btnWeb.setOnClickListener{
            var uri = Uri.parse("https://raracost.com/index.php")
            var intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }

}