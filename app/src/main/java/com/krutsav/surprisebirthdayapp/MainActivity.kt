package com.krutsav.surprisebirthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        TODO: 1. Improve placement of text views
//        TODO: 2. Make background change color, to create text change feeling
    }

    fun onLayoutClick(view: View) {
     try {
         val arrList = ArrayList<String>()
         arrList.add("Happy Birmthday")
         arrList.add("Hope all your birthday wishes come true")
         arrList.add("Have a great day!")
         arrList.add("May this year bring all your wishes together")
         arrList.add("I pray life would be less harsh this year")
         arrList.add("May God bless you with a great year")
         arrList.add("You are awesome, may your awesomeness reach another level")
         arrList.add("Do care did asked, plus you're awesome")
         arrList.add("I'll tell the stars about you 💌")

         val tvArr = arrayOf(tv1,tv2,tv3,tv4,tv5)

         for(i in 0..4){
             Log.i("Index","Error")
             tvArr[i].text = ""
         }

//         val randomIndex = List(7){ Random.nextInt(0,arrList.size) }
//
         tvArr[(0..4).random()].text = arrList[(0..(arrList.size-1)).random()].toString()



     }catch (e:Exception)  {
         Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show()
         Log.i("Exception", e.toString())
     }

    }


}