package com.gdx.perichetla.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getAge(view:View)
    {
        val in_year:Int = yearOfBirth.text.toString().toInt()
        val curr_year: Int = Calendar.getInstance().get(Calendar.YEAR)
        if((in_year==0)||(in_year>curr_year))
        {
            answer_text.text = "Invalid Date, y'all!"
            return
        }
        val calc_age = curr_year-in_year
        answer_text.text = "Your Age is $calc_age years!"
    }
}
