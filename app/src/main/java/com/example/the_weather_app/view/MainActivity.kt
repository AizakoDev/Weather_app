package com.example.the_weather_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.the_weather_app.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,MainFragment,newInstance()).commit()


        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })


    }

    fun Click(view: View) {
    }



}