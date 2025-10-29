package com.hyomin.termproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
        var buttonReturn = findViewById<Button>(R.id.btnReturn)

        buttonReturn.setOnClickListener {
            finish()

        }

        var btnDial = findViewById<Button>(R.id.btnDial)
        btnDial.setOnClickListener {
            var uri = Uri.parse("tel : 053-810-2490")
            var intent = Intent(Intent.ACTION_DIAL,uri)
            startActivity(intent)
        }
    }
}