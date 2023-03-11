package com.cssun.flcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class day_year_conversion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_year_conversion)

        val daysEditText = findViewById<EditText>(R.id.daysEditText)
        val weeksTextView = findViewById<TextView>(R.id.weeksTextView)
        val monthsTextView = findViewById<TextView>(R.id.monthsTextView)
        val yearsTextView = findViewById<TextView>(R.id.yearsTextView)
        val convertButton = findViewById<Button>(R.id.convertButton)

        convertButton.setOnClickListener {
            val days = daysEditText.text.toString().toIntOrNull() ?: return@setOnClickListener

            val weeks = daysToWeeks(days)
            val months = daysToMonths(days)
            val years = daysToYears(days)

            weeksTextView.text = String.format("%.2f", weeks)
            monthsTextView.text = String.format("%.2f", months)
            yearsTextView.text = String.format("%.2f", years)
        }
    }

    private fun daysToWeeks(days: Int): Double {
        return days.toDouble() / 7
    }

    private fun daysToMonths(days: Int): Double {
        return days.toDouble() / 30
    }

    private fun daysToYears(days: Int): Double {
        return days.toDouble() / 365
    }
}