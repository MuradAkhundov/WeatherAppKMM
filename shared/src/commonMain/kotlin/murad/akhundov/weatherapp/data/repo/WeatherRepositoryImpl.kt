package murad.akhundov.weatherapp.data.repo

import murad.akhundov.weatherapp.data.mapper.toDomain
import murad.akhundov.weatherapp.data.remote.ApiService
import murad.akhundov.weatherapp.domain.model.ForeCast
import murad.akhundov.weatherapp.domain.model.Weather
import murad.akhundov.weatherapp.domain.repo.WeatherRepository

class WeatherRepositoryImpl(private val apiService: ApiService) :WeatherRepository{
    override suspend fun getCurrentWeatherInfo(lat: Double, long: Double): Weather {
        return apiService.currentWeatherInfo(lat, long).toDomain()
    }

    override suspend fun getForecastInfo(lat: Double, long: Double): List<ForeCast> {
        return apiService.forecastInfo(lat, long).toDomain()
    }
}