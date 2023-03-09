package com.cssun.flcalendar

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class Date_to_Day : AppCompatActivity() {
    private var formatDate = SimpleDateFormat("dd MM yyyy", Locale.US)

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_to_day)

        val calendarView2 = findViewById<CalendarView>(R.id.CustcalendarView)
        val calbt = findViewById<Button>(R.id.calb)
        val getda = findViewById<TextView>(R.id.getd)


        calbt.setOnClickListener {
            val getDate: Calendar = Calendar.getInstance()
            val datepicker = DatePickerDialog(this,android.R.style.Theme_Holo_Dialog,
                DatePickerDialog.OnDateSetListener { _, i, i2, i3->

                val selectDate: Calendar = Calendar.getInstance()
                selectDate.set(Calendar.YEAR,i)
                selectDate.set(Calendar.MONTH,i2)
                selectDate.set(Calendar.DAY_OF_MONTH,i3)

                val date =formatDate.format(selectDate.time)


                val simpleDateFormat = SimpleDateFormat("dd MM yyyy", Locale.US)
                val day = simpleDateFormat.parse(date)
                val calendar = Calendar.getInstance()
                calendar.time = day

                val dayName = when (calendar.get(Calendar.DAY_OF_WEEK)) {
                    1 -> "Sunday"
                    2 -> "Monday"
                    3 -> "Tuesday"
                    4 -> "Wednesday"
                    5 -> "Thursday"
                    6 -> "Friday"
                    7 -> "Saturday"
                    else -> ""
                }

                getda.text= "it's $dayName on $date"

                    val CalendarView2 = Calendar.getInstance().apply {
                        set(Calendar.YEAR,Calendar.YEAR)
                        set(Calendar.MONTH,Calendar.MONTH)

                    }
                    calendarView2.date = calendar.timeInMillis

            }, getDate.get(Calendar.YEAR), getDate.get(Calendar.MONTH), getDate.get(Calendar.DAY_OF_MONTH))
            datepicker.show()



        }
    }
}