package com.example.tempreture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toCelcius(view:View)
    {
        val temp = findViewById<EditText>(R.id.tempBar)
        val fahrenheit=temp.text.toString()
        if(!fahrenheit.isBlank())
        {
            val celcius = (fahrenheit.toDouble()-32)*5/9
            val toPrint = String.format("%.2f" , celcius)
            Toast.makeText(this , "Degree of $fahrenheit is $toPrint in celcius" , Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this , "Please enter temperature first" , Toast.LENGTH_LONG).show()
        }
    }

    fun toFahrenheit(view:View)
    {
        val temp = findViewById<EditText>(R.id.tempBar)
        val celcius = temp.text.toString()
        if(!celcius.isBlank())
        {
            val fahrenheit = (1.8*celcius.toDouble())+32
            val toPrint = String.format("%.2f" , fahrenheit)
            Toast.makeText(this , "Degree of $celcius is $toPrint in fahrenheit" , Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this , "Please enter temperature first" , Toast.LENGTH_LONG).show()
        }
    }
}