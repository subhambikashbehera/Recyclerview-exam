package com.subhambikash.recyclerview_exam

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RelativeLayout
import androidx.appcompat.content.res.AppCompatResources

class RadioButton : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        val rootLayout:RelativeLayout=findViewById(R.id.rootLayout)
        val red:RadioButton=findViewById(R.id.red)
        val blue:RadioButton=findViewById(R.id.blue)
        val green:RadioButton=findViewById(R.id.green)

        red.setOnClickListener {
            rootLayout.setBackgroundColor(Color.RED)
        }
        blue.setOnClickListener {
            rootLayout.setBackgroundColor(Color.BLUE)
        }
        green.setOnClickListener {
            rootLayout.setBackgroundColor(Color.GREEN)
        }






    }


}