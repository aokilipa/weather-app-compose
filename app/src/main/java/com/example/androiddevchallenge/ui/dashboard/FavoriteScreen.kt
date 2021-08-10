package com.example.androiddevchallenge.ui.dashboard

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CloudCircle
import androidx.compose.material.icons.outlined.WrapText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.blue
import com.example.androiddevchallenge.ui.theme.typography


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FavoriteScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val numbers = (0..5).toList()

        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            modifier = Modifier.padding(16.dp)
        ) {
            items(numbers.size) {
                Column(
                    modifier = Modifier.padding(top = 16.dp, start = 8.dp, end = 8.dp)) {
                    FavItemCard()
                }

            }
        }
    }
}

@Composable
fun FavItemCard() {
    Card(modifier = Modifier.fillMaxWidth().background(color = Color.White)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column() {
                    Text(text = "18", style = typography.h4)
                    Text(text = "San Fransisco", style = typography.body2,modifier = Modifier.padding(top = 8.dp))
                    Text(text = "USA", style = typography.caption.copy(fontSize = 10.sp))
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_sunny),
                    contentDescription = "",
                    modifier = Modifier.padding(top = 8.dp)
                )

            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(top=16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Icon(
                    imageVector = Icons.Outlined.CloudCircle,
                    contentDescription = "",
                    modifier = Modifier.size(16.dp)
                )
                Text(text = "17%", style = typography.overline)
                Icon(
                    imageVector = Icons.Outlined.WrapText,
                    contentDescription = "",
                    modifier = Modifier.size(16.dp)
                )
                Text(text = "7km/h", style = typography.overline)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteScreenPreview() {
    FavoriteScreen()
}