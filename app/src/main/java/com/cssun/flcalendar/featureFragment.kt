package com.cssun.flcalendar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class featureFragment : Fragment(), View.OnClickListener {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_feature, container, false)
        val btn_ddd: RelativeLayout = view.findViewById(R.id.btn_date_to_day)
        btn_ddd.setOnClickListener(this)
        val btn_date_dif: RelativeLayout = view.findViewById(R.id.btn_date_diff)
        btn_date_dif.setOnClickListener(this)
        val day_year_conversion: RelativeLayout = view.findViewById(R.id.day_year)
       day_year_conversion.setOnClickListener(this)
        return view
    }

    companion object {


        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            featureFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_date_to_day -> {
                val intent1 = Intent(activity,Date_to_Day::class.java)
                startActivity(intent1)
            }
           R.id.btn_date_diff -> {
                val intent5 = Intent(activity,Date_Dif::class.java)
                startActivity(intent5)
            }
            R.id.day_year -> {
                val intent6 = Intent(activity,day_year_conversion::class.java)
                startActivity(intent6)
            }
            else -> {}
        }

    }
}

