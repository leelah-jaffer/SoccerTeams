package com.example.soccerteams

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays
import android.util.Log.v

//logging the content of the array
fun logArrayValues (arr: Array<String>, i: Int) {
    Log.v("Array Values:", Arrays.toString(arr))
}

fun getShortestString(arr: Array<String>) : String {
    var shortestLength = 0
    var shortestElement = ""
    for(element in arr) {
        if (element.count () > shortestLength) {
            shortestLength = element.count ()
            shortestElement = element

        }
    }
    return shortestElement
}

class MainActivity : AppCompatActivity() {

    // Created Array for soccer teams
    val teams = arrayOf<String>(
        "Mamelodi Sundowns FC", "Bidvest Wits", "Orlando Pirates",
        "Kaizer Chiefs", "Cape Town City FC"
    )


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Creating variable to hold the textview
        val teamsTxt = findViewById<TextView>(R.id.teamsDisplayId)

        // add all the teams to the display string
        var teamsDisplay = ""
        for (team in teams) {
            teamsDisplay += "${team}\n"
        }
        //set the text views text to the teams display string
        teamsTxt.text = teamsDisplay

        // call the log for the array values and teams being in () is called the argument of the array, the argument of the array has to be concatinated.
        logArrayValues(teams, 4)
        logArrayValues(teams, 4)


        // call the getShortestString function
        var shortestName = getShortestString(teams)
        Log.v("Shortest name", shortestName)

    }


    //    var teamDisplay = ""
    //   teamDisplay += "${teams[0]}\n"
    //teamDisplay += "${teams[1]}\n"
    //teamDisplay += "${teams[2]}\n"
    //teamDisplay += "${teams[3]}\n"
    //teamDisplay += "${teams[4]}\n"

    //teamsTxt.text = teamDisplay

    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets
    }
