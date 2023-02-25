package com.cssun.flcalendar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Fragment_Settings : Fragment(), View.OnClickListener {

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
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view:View=inflater!!.inflate(R.layout.fragment__settings,container,false)

        val thbtn: Button = view.findViewById(R.id.tbtn)
        thbtn.setOnClickListener(this)
        val abbtn: Button = view.findViewById(R.id.abtn)
        abbtn.setOnClickListener(this)
        return view
    }


    companion object {


        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_Settings().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

override fun onClick(v: View?){
    when(v?.id){
        R.id.tbtn ->
        {
            val intent2= Intent(activity,theme::class.java)
            startActivity(intent2)}
        R.id.abtn ->
        {
            val intent3= Intent(activity,about::class.java)
            startActivity(intent3)
        }
        else ->
        {
        }

    }

}
}
