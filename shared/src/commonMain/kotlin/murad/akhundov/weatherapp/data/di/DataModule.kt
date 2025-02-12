package murad.akhundov.weatherapp.data.di

import murad.akhundov.weatherapp.data.remote.ApiService
import murad.akhundov.weatherapp.data.remote.KtorClient
import murad.akhundov.weatherapp.data.repo.WeatherRepositoryImpl
import murad.akhundov.weatherapp.domain.repo.WeatherRepository
import org.koin.dsl.module

val dataModule = module {
    factory { KtorClient.client }
    factory <ApiService>{  ApiService(get()) }
    factory<WeatherRepository> { WeatherRepositoryImpl(get()) }
}