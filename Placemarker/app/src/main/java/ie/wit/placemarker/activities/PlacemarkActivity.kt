package ie.wit.placemarker.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import ie.wit.placemarker.databinding.ActivityPlacemarkBinding
import ie.wit.placemarker.main.MainApp
import ie.wit.placemarker.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i


class PlacemarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlacemarkBinding
    var placemark = PlacemarkModel()
    lateinit var app : MainApp

    fun printAll(strings: MutableList<String>) {
        for(s in strings) print("$s ")
        println()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityPlacemarkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.plant(Timber.DebugTree())
        app = application as MainApp


        i("ACTIVITY STARTED")


        binding.btnAdd.setOnClickListener() {

            placemark.title = binding.placemarkTitle.text.toString()
            placemark.description = binding.placemarkDescription.text.toString()

            if(placemark.title.isNotEmpty()){
                app.placemarks.add(placemark.copy());

                i("add button pressed: ${placemark}")

                for (i in app.placemarks.indices){
                    i("PLacemark[$i]:${this.app.placemarks[i]}")
                }

            }

            else{
                Snackbar.make(it, "Please enter a title", Snackbar.LENGTH_LONG).show()
//                Snackbar.make(it, "Please enter a description", Snackbar.LENGTH_LONG).show()
            }

//
//        binding.btnAdd.setOnClickListener() {
//            placemark.description = binding.placemarkDescription.text.toString()
//
//            if (placemark.description.isNotEmpty()){
//                i("${placemark.description}" )
//            }
//            else{
//                Snackbar.make(it, "Please enter a description", Snackbar.LENGTH_LONG).show()
//            }
//        }
    }
}
    }