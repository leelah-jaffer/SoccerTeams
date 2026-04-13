package com.example.soccerteams

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays
import kotlin.toString

//loggint the conent of the array
fun logArrayValues (arr: Array<String>) {
    Log.v("Array Values:", Arrays.toString(arr))
}

class MainActivity : AppCompatActivity() {

    // Created Array for soccer teams
    val teams = arrayOf<String>("Mamelodi Sundowns FC", "Bidvest Wits", "Orlando Pirates",
        "Kaizer Chiefs", "Cape Town City FC")
    var teamDisplay = ""
    var count = 0



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Creating variable to hold the textview
        val teamsTxt = findViewById<TextView>(R.id.teamsDisplayId)

        //Re-assigned position 0
        teams[0] = "Mamelodi Sundowns FC :)"

        for (team in teams) {
            teamDisplay += "${team}\n"
        }



    //    var teamDisplay = ""
     //   teamDisplay += "${teams[0]}\n"
        //teamDisplay += "${teams[1]}\n"
        //teamDisplay += "${teams[2]}\n"
        //teamDisplay += "${teams[3]}\n"
        //teamDisplay += "${teams[4]}\n"

        //Putting Array in textView
        teamsTxt.text = Arrays.toString(teams)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}