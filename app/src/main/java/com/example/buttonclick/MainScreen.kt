package com.example.buttonclick

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ///Ex[licit Intent::

        setContentView(R.layout.activity_main_screen)
        val passData= findViewById<TextView>(R.id.text_view_seconde_screen)
     val received=intent.getStringExtra("name");
        passData.text=received.toString()
        val  shareBtn=findViewById<Button>(R.id.buttonshare)

        
///implicit Intent::

     shareBtn.setOnClickListener {
         val share=Intent(Intent.ACTION_VIEW)
         share.data=   Uri.parse("https://www.google.com")
         startActivity(share);
     }




    }
}