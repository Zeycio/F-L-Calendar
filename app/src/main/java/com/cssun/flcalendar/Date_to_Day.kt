package com.cssun.flcalendar


import android.annotation.SuppressLint
import android.media.audiofx.HapticGenerator
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.HapticFeedbackConstants
import android.widget.*
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.util.*

class Date_to_Day : AppCompatActivity() {

    private lateinit var datePicker: DatePicker


    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_to_day)
         val calv =findViewById<CalendarView>(R.id.CalV1)
        val getda = findViewById<TextView>(R.id.getd)
        datePicker = findViewById(R.id.dpd)




        datePicker.setOnDateChangedListener { view, year, month, dayOfMonth ->
            view.performHapticFeedback(HapticFeedbackConstants.CONFIRM)

            val calendar = Calendar.getInstance()
            calendar.set(year, month, dayOfMonth)


            val dayOfWeek = SimpleDateFormat("EEEE", Locale.getDefault()).format(calendar.time)


            calendar.set(year, month, dayOfMonth)
            calv.date = calendar.timeInMillis
            getda.text= "it's $dayOfWeek "


        }

    }
}








