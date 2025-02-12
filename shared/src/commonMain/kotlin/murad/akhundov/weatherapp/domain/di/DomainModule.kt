package murad.akhundov.weatherapp.domain.di

import murad.akhundov.weatherapp.domain.use_case.GetCurrentWeatherInfoUseCase
import murad.akhundov.weatherapp.domain.use_case.GetForecastInfoUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetCurrentWeatherInfoUseCase(get()) }
    factory { GetForecastInfoUseCase(get()) }
}