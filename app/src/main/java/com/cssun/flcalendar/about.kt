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
        val insta_btn=findViewById<Button>(R.id.insta_bt)
        val github_btn =findViewById<Button>(R.id.github_bt)
        updbtn.setOnClickListener {
            Toast.makeText(this@about,"Help me \uD83E\uDD79", Toast.LENGTH_SHORT).show()
        }
        insta_btn.setOnClickListener{
            val urlIntentInsta = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/sathwik_cs?utm_source=qr"
                ))
            startActivity(urlIntentInsta)

        }
        github_btn.setOnClickListener{
            val urlIntentGithub = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://github.com/sathwikcs"
                ))
            startActivity(urlIntentGithub)
        }

    }
}

