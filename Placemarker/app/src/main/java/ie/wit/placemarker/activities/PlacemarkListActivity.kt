package ie.wit.placemarker.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ie.wit.placemarker.R
import ie.wit.placemarker.main.MainApp

class PlacemarkListActivity : AppCompatActivity (){

    lateinit var app : MainApp


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark_list)
        app = application as MainApp
    }

}