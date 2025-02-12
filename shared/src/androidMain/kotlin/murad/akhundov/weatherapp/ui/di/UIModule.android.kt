package murad.akhundov.weatherapp.ui.di

import murad.akhundov.weatherapp.ui.WeatherViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

private val viewModelModule = module {
    single { WeatherViewModel(get(),get()) }
}
actual fun sharedViewModelModule(): Module = viewModelModule