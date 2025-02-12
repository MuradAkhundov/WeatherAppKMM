package murad.akhundov.weatherapp.data.model.forecast

import murad.akhundov.weatherapp.data.model.MainDTO
import murad.akhundov.weatherapp.data.model.WeatherDTO
import kotlinx.serialization.Serializable

@Serializable
data class ForecastDTO(
    val dt: Int,
    val main: MainDTO,
    val weather: List<WeatherDTO>,
)