package ie.wit.placemarker.main

import android.app.Application
import ie.wit.placemarker.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    val placemarks = ArrayList<PlacemarkModel>()


    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Placemarker started")
    }

}