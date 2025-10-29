package com.hyomin.termproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fourth_layout)
        var buttonReturn = findViewById<Button>(R.id.btnReturn)

        buttonReturn.setOnClickListener{
            val page = Intent(applicationContext, ThirdActivity::class.java)
            startActivity(page)

        }

        var btnWeb = findViewById<Button>(R.id.btnWeb)

        btnWeb.setOnClickListener{
            var uri = Uri.parse("https://www.google.co.kr/maps/search/%EB%9D%BC%EB%9D%BC%EC%BD%94%EC%8A%A4%ED%8A%B8")
            var intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }


}