package murad.akhundov.weatherapp

import android.app.Application
import murad.akhundov.weatherapp.data.di.dataModule
import murad.akhundov.weatherapp.domain.di.domainModule
import murad.akhundov.weatherapp.ui.di.sharedViewModelModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(dataModule + domainModule + sharedViewModelModule())
        }
    }
}