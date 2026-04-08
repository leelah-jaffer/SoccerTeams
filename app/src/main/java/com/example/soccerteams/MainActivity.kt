package com.example.soccerteams

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays
import kotlin.toString

class MainActivity : AppCompatActivity() {

    // Created Array for soccer teams
    val teams = arrayOf<String>("Mamelodi Sundowns FC", "Bidvest Wits", "Orlando Pirates",
        "Kaizer Chiefs", "Cape Town City FC")


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Creating variable to hold the textview
        val teamsTxt = findViewById<TextView>(R.id.teamsDisplayId)

        //Re-assigned position 0
        teams[0] = "Mamelodi Sundowns FC :)"

        //Putting Array in string   
        teamsTxt.text = Arrays.toString(teams)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}