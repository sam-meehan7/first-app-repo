package ie.wit.placemarker.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import ie.wit.placemarker.databinding.ActivityMainBinding
import ie.wit.placemarker.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var placemark = PlacemarkModel()
    val placemarks = ArrayList<String>()

    fun printAll(strings: MutableList<String>) {
        for(s in strings) print("$s ")
        println()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.plant(Timber.DebugTree())


        i("ACTIVITY STARTED")


        binding.btnAdd.setOnClickListener() {
            i("add button pressed")

            placemark.title = binding.placemarkTitle.text.toString()
            placemark.description = binding.placemarkDescription.text.toString()

            if(placemark.title.isNotEmpty() && placemark.description.isNotEmpty() ){
                i("${placemark.title} was added to the list of placemarks" )
                i("${placemark.description} is the desc" )

                Snackbar.make(it, "${placemark.title} was added to the list of placemarks", Snackbar.LENGTH_LONG).show()
                placemarks.add(placemark.title);
            }

            else{
                Snackbar.make(it, "Please enter a title", Snackbar.LENGTH_LONG).show()
                Snackbar.make(it, "Please enter a description", Snackbar.LENGTH_LONG).show()
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

        binding.btnPrint.setOnClickListener(){
            printAll(placemarks)
        }

    }
}
    }