package com.example.weatherapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.weatherapp.model.Hourly
import com.example.weatherapp.model.Weather
import com.example.weatherapp.shared.Platform
import com.example.weatherapp.ui.theme.altTextColor
import com.example.weatherapp.ui.theme.typography

@Composable
fun WeatherSummary() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = "San Fransisco")
            Text(text = "18\u00B0", style = typography.h3)
            Box(
                modifier = Modifier
                    .background(color = Color.LightGray, shape = RoundedCornerShape(20.dp))
            ) {
                //Spacer(Modifier.matchParentSize().background(Color.LightGray))

                Text(
                    text = "Cloudy",
                    modifier = Modifier.padding(
                        top = 4.dp,
                        bottom = 4.dp,
                        end = 8.dp,
                        start = 8.dp
                    ),
                    style = typography.caption
                )
            }
        }
        SunShape(size = 120.dp)
    }

}

@Composable
fun WeatherStats() {
    Row(
        modifier = Modifier
            .padding(top = 16.dp, bottom = 16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "13%")
        Text(text = "0.533 mBar")
        Text(text = "9km/h")
    }
}

@Composable
fun TimeOfDay(hourly: List<Hourly>) {
    Text(
        "Today",
        style = TextStyle(color = altTextColor),
        modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
    )
    LazyRow(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        items(hourly) { data ->
            TimeItem(data = data)
        }
    }
}

@Composable
fun TimeItem(data: Hourly) {
    Column(
        modifier = Modifier.padding(end = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = data.time)
        Icon(imageVector = Icons.Default.Cloud, contentDescription = null)
        Text(text = "${data.temp}")
    }
}

@Composable
fun DailyWeather(weather: List<Weather>) {
    LazyColumn(Modifier.padding(top = 16.dp)) {
        items(weather) { w ->
            DailyItem(weather = w)
        }
    }
}

@Composable
fun DailyItem(weather: Weather) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp, top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = weather.dayOfWeek, modifier = Modifier.size(width = 74.dp, height = 24.dp))
        Icon(imageVector = Icons.Default.Cloud, contentDescription = null)
        Row {
            Text(text = "${weather.max}", modifier = Modifier.padding(end = 16.dp))
            Text(text = "${weather.min}", color = altTextColor)
        }
    }
}