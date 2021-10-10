package com.example.weatherapp.ui.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.model.hourlyList
import com.example.weatherapp.model.weatherlist
import com.example.weatherapp.ui.component.*
import com.example.weatherapp.ui.theme.MyTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        WeatherSummary()
        WeatherStats()
        TimeOfDay(hourly = hourlyList)
        DailyWeather(weather = weatherlist)
    }
}

@Composable
fun HomePreview() {
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(bottomBar = {
            BottomNavigationBar(navController = navController)
        }) {
            HomeScreen()
        }
    }

}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        HomePreview()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        HomePreview()
    }
}
