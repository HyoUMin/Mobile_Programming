package com.hyomin.termproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class menu1 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_layout)
        var buttonReturn = findViewById<Button>(R.id.btnReturn)

        buttonReturn.setOnClickListener{
            val page = Intent(applicationContext, SecondActivity::class.java)
            startActivity(page)

        }

        var btnWeb = findViewById<Button>(R.id.btnWeb)

        btnWeb.setOnClickListener{
            var uri = Uri.parse("https://blog.naver.com/dangpig/222917643478")
            var intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }

}
