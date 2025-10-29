package com.hyomin.termproject

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.ImageView
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.hyomin.termproject.R.layout.activity_main)

        findViewById<Button>(com.hyomin.termproject.R.id.buttonNewActivity).setOnClickListener {
            val veganRadioButton =
                findViewById<View>(com.hyomin.termproject.R.id.second) as RadioButton
            val vegeRadioButton =
                findViewById<View>(com.hyomin.termproject.R.id.third) as RadioButton
            val vegRadioButton =
                findViewById<View>(com.hyomin.termproject.R.id.fourth) as RadioButton
            val vRadioButton = findViewById<View>(com.hyomin.termproject.R.id.menu1) as RadioButton

            if (vRadioButton.isChecked) {
                val page = Intent(applicationContext, menu1::class.java)
                startActivity(page)
            } else if (veganRadioButton.isChecked) {
                val page = Intent(applicationContext, SecondActivity::class.java)
                startActivity(page)
            } else if (vegeRadioButton.isChecked) {
                val page = Intent(applicationContext, ThirdActivity::class.java)
                startActivity(page)
            } else if (vegRadioButton.isChecked) {
                val page = Intent(applicationContext, FourthActivity::class.java)
                startActivity(page)
            } else {

            }
        }

        var mPlayer:MediaPlayer
        mPlayer = MediaPlayer.create(this,R.raw.horizon)
        var switch1 = findViewById<Switch>(R.id.switch1)
        switch1.setOnClickListener{
            if(switch1.isChecked == true)
                mPlayer.start()
            else
                mPlayer.stop()
        }

        var maPlayer:MediaPlayer
        maPlayer = MediaPlayer.create(this,R.raw.whea)
        var switch2 = findViewById<Switch>(R.id.switch2)
        switch2.setOnClickListener{
            if(switch2.isChecked == true) {
                maPlayer.start()
            } else {
                maPlayer.stop()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?) :Boolean{
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.item1
            -> {
                var uri =
                    Uri.parse("https://www.baemin.com/?NaPm=ct%3Dlb7v94j2%7Cci%3Dcheckout%7Ctr%3Dds%7Ctrx%3D%7Chk%3Dff321cf3c0d5b6549760083f6f55b15915002ec8")
                var intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.Item2_1
            -> {
                var uri = Uri.parse("https://electronics.yu.ac.kr/electronics/index.do")
                var intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.Item2_2
            -> {
                var uri = Uri.parse("https://arch.yu.ac.kr/arch/index.do")
                var intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.item3
            -> {
                var uri = Uri.parse("https://www.yogiyo.co.kr/mobile/#/")
                var intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }


        }
        return super.onOptionsItemSelected(item)
    }


}
