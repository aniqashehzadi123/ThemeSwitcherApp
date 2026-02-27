package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonLight= findViewById<Button>(R.id.btnLight)
        val layout= findViewById<LinearLayout>(R.id.linearLayout)

        buttonLight.setOnClickListener{
            layout.setBackgroundColor(getColor(R.color.yellow))

            
        }
        buttonDark.setOnClickListener{
            layout.setBackgroundColor(getColor(R.color.black))


        }
        val btnIntent= findViewById<Button>(R.id.btnbutton)
        btnIntent.setOnClickListener(){
            intent= Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)


        }

    }

    private fun setonClickListener(function: () -> Unit) {}
}