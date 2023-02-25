package com.cssun.flcalendar

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class about : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val updbtn=findViewById<Button>(R.id.upbtn)
        val sathdbtn=findViewById<Button>(R.id.sath)
        updbtn.setOnClickListener {
            Toast.makeText(this@about,"First Donate next Update", Toast.LENGTH_SHORT).show()
        }
        sathdbtn.setOnClickListener{
            val urlIntentS = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/sathwik_cs?utm_source=qr"
                ))
            startActivity(urlIntentS)

        }

    }
}

