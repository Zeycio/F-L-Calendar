package com.cssun.flcalendar

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =supportFragmentManager.findFragmentById(R.id.Frag_Cont_View) as NavHostFragment
        navController=navHostFragment.navController


        val btnNavView=findViewById<BottomNavigationView>(R.id.btm_Nav)
        NavigationUI.setupWithNavController(btnNavView, navController)

      /*  if (supportActionBar !=null){
            supportActionBar !!.hide()
        } */
    }
}