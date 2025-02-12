package murad.akhundov.weatherapp.di

import org.koin.core.context.startKoin
import murad.akhundov.weatherapp.data.di.dataModule
import murad.akhundov.weatherapp.domain.di.domainModule
import murad.akhundov.weatherapp.ui.di.sharedViewModelModule

fun initKoin(){
    startKoin {
        modules(dataModule + domainModule + sharedViewModelModule())
    }
}