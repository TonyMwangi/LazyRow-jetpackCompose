package com.tonymwangi.lazyrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tonymwangi.lazyrow.ui.theme.LazyRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRowTheme {
                Surface(color = MaterialTheme.colors.background) {
                    LazyColumn(contentPadding = PaddingValues(vertical = 20.dp),
                        modifier = Modifier.fillMaxSize().background(color = Color.Black),)
                    {
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f).padding(0.dp, 20.dp, 0.dp, 30.dp),
                            horizontalArrangement = Arrangement.Center) {
                                Text(text = "NETFLIX MOVIEZ",
                                    color = Color.Red,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 22.sp
                                )

                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)
                                .padding(6.dp, 0.dp,0.dp, 0.dp)) {
                                Text(text = "Continue Watching For Netflix Member",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )

                            }
                        }
                        item {
                            LazyRow(modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(0.dp, 10.dp,0.dp,10.dp)
                                //.background(color = Color.Black)
                            )
                            {
                                items(movies) { movie ->
                                    ScrollableRow(movie)
                                }
                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)
                                .padding(6.dp, 0.dp,0.dp, 0.dp)) {
                                Text(text = "New Release",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )

                            }
                        }
                        item {
                            LazyRow(modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(0.dp, 10.dp,0.dp,10.dp)
                                //.background(color = Color.Black)
                            )
                            {
                                items(movies) { movie ->
                                    ScrollableRow(movie)
                                }
                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)
                                .padding(6.dp, 0.dp,0.dp, 0.dp)
                                ) {
                                Text(text = "Trending Now",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )

                            }
                        }
                        item {
                            LazyRow(modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(0.dp, 10.dp,0.dp,10.dp)
                                //.background(color = Color.Black)
                            )
                            {
                                items(movies) { movie ->
                                    ScrollableRow(movie)
                                }
                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)
                                .padding(6.dp, 0.dp,0.dp, 0.dp)) {
                                Text(text = "Tv Series",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )

                            }
                        }
                        item {
                            LazyRow(modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(0.dp, 10.dp,0.dp,10.dp)
                                //.background(color = Color.Black)
                            )
                            {
                                items(movies) { movie ->
                                    ScrollableRow(movie)
                                }
                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)
                                .padding(6.dp, 0.dp,0.dp, 0.dp)) {
                                Text(text = "Only on Netflix ",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )

                            }
                        }
                        item {
                            LazyRow(modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(0.dp, 10.dp,0.dp,10.dp)
                                //.background(color = Color.Black)
                            )
                            {
                                items(movies) { movie ->
                                    ScrollableRow(movie)
                                }
                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)
                                .padding(6.dp, 0.dp,0.dp, 0.dp)) {
                                Text(text = "High School Tv Dramas ",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )

                            }
                        }
                        item {
                            LazyRow(modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(0.dp, 10.dp,0.dp,10.dp)
                                //.background(color = Color.Black)
                            )
                            {
                                items(movies) { movie ->
                                    ScrollableRow(movie)
                                }
                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)
                                .padding(6.dp, 0.dp,0.dp, 0.dp)) {
                                Text(text = " Top Picks for Netflix Member",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )

                            }
                        }
                        item {
                            LazyRow(modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(0.dp, 10.dp,0.dp,10.dp)
                                //.background(color = Color.Black)
                            )
                            {
                                items(movies) { movie ->
                                    ScrollableRow(movie)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
data class Movies(
    val image: Int,
    val ratingIcon: Int,
    val name: String,
    val rating: String

)
val movies = listOf(
    Movies(
        image = R.drawable.city7,
        name = "MONEY HEIST",
        ratingIcon = R.drawable.rating,
        rating = "5.5"
    ),
    Movies(
        image = R.drawable.city1,
        name = "DEATH BEACH ",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city2,
        name = "ANNAH",
        ratingIcon = R.drawable.rating,
        rating = "5.3"
    ),
    Movies(
        image = R.drawable.city3,
        name = "INTO THE BADLAND",
        ratingIcon = R.drawable.rating,
        rating = "4.0"
    ),
    Movies(
        image = R.drawable.city4,
        name = "The Protector",
        ratingIcon = R.drawable.rating,
        rating = "5.1"
    ),
    Movies(
        image = R.drawable.city10,
        name = "Imitatition Game",
        ratingIcon = R.drawable.rating,
        rating = "3.0"
    ),
    Movies(
        image = R.drawable.city5,
        name = "LUTHER",
        ratingIcon = R.drawable.rating,
        rating = "4.9"
    ),
    Movies(
        image = R.drawable.city7,
        name = "Seal Team",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city8,
        name = "DEALER",
        ratingIcon = R.drawable.rating,
        rating = "4.1"
    ),
    Movies(
        image = R.drawable.city9,
        name = "Night Crawler",
        ratingIcon = R.drawable.rating,
        rating = "4.6"
    ),
    Movies(
        image = R.drawable.city10,
        name = "Shadows",
        ratingIcon = R.drawable.rating,
        rating = "3.8"
    ),
    Movies(
        image = R.drawable.city7,
        name = "FATE",
        ratingIcon = R.drawable.rating,
        rating = "4.5"
    ),
    Movies(
        image = R.drawable.city4,
        name = "Titanic",
        ratingIcon = R.drawable.rating,
        rating = "4.7"
    ),
    Movies(
        image = R.drawable.city7,
        name = "Xanar",
        ratingIcon = R.drawable.rating,
        rating = "4.9"
    ),
)

@Composable
fun ScrollableRow(movie : Movies) {
    val companyIcon = R.drawable.netflix
    Box(
        modifier = Modifier
            .width(225.dp)
            .height(132.dp)
            .padding(6.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(Color.White)
            .border(1.dp, Color.White, shape = RoundedCornerShape(8.dp))

    )
    {

        Image(
            painter = painterResource(id = movie.image),
            modifier = Modifier
                .width(225.dp)
                .height(132.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .align(alignment = Alignment.TopCenter),
            contentDescription = null
        )
        Image(
            painter = painterResource(id = companyIcon),
            modifier = Modifier
                .size(20.dp)
                .align(alignment = Alignment.TopStart)
                .padding(2.dp, 8.dp, 0.dp, 0.dp),
            contentDescription = null
        )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(0.dp, 5.dp,0.dp, 5.dp)
                    .fillMaxWidth(1f)
                    .align(Alignment.Center)
            ) {
                Text(
                    text = movie.name,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(0.dp, 8.dp,0.dp, 20.dp)
        ) {
            Image(
                painter = painterResource(id = movie.ratingIcon),
                modifier = Modifier.size(20.dp),
                contentDescription = null
            )
            Text(
                text = movie.rating,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }


        }

    }