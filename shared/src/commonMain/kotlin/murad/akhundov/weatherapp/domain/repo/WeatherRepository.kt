package murad.akhundov.weatherapp.domain.repo

import murad.akhundov.weatherapp.domain.model.ForeCast
import murad.akhundov.weatherapp.domain.model.Weather

interface WeatherRepository {

    suspend fun getCurrentWeatherInfo(lat: Double, long: Double): Weather

    suspend fun getForecastInfo(lat: Double, long: Double): List<ForeCast>

}