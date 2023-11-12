package com.example.buttonclick


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //entry Point ::

        setContentView(R.layout.activity_main)

        //Finding Of IDs::

        val viewData=findViewById<TextView>(R.id.textviewdata)
        val btn=findViewById<Button>(R.id.clickme);
        btn.setOnClickListener{

            Toast.makeText(this, "Hello Button Click Done", Toast.LENGTH_SHORT).show()
        }

        Handler(Looper.getMainLooper()).postDelayed({
            ///define ka kon si screen pr jha ga ::

val intent=Intent(this,MainScreen::class.java);
            val data=viewData.text.toString();
            ///putExtra::

            intent.putExtra("name",data)

            startActivity(intent);


        },5000);
    }
}