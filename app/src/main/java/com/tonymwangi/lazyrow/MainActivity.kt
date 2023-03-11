package com.tonymwangi.lazyrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize().background(color = Color.Black),
                    //color = MaterialTheme.colors.background
                ) {
                    LazyColumn(contentPadding = PaddingValues(vertical = 20.dp))
                    {
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f).padding(vertical = 20.dp),
                            horizontalArrangement = Arrangement.Center) {
                                Text(text = "NETFLIX MOVIEZ",
                                    color = Color.Red,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 22.sp
                                )

                            }
                        }
                        item {
                            Row(modifier = Modifier.fillMaxWidth(1f)) {
                                Text(text = "Trending Now",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
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
        name = "Into The BadLand",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city1,
        name = "Beach of Death ",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city2,
        name = "Call Me Annah",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city3,
        name = "Better Today",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city4,
        name = "Dear Tony Evans",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city10,
        name = "Imitatition Game",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city5,
        name = "Moonrise Kingdom",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city7,
        name = "Seal Team",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city8,
        name = "Rain Man",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city9,
        name = "Night Crawler",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city10,
        name = "Shadows",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city7,
        name = "Worrier One",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city4,
        name = "Titanic",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
    Movies(
        image = R.drawable.city7,
        name = "Xanar",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
)

@Composable
fun ScrollableRow(movie : Movies) {
    val companyIcon = R.drawable.netflix
    Box(
        modifier = Modifier
            .width(222.dp)
            .height(133.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .padding(4.dp)
            .background(Color.White)
    )
    {

        Image(
            painter = painterResource(id = movie.image),
            modifier = Modifier
                .width(220.dp)
                .height(133.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .align(alignment = Alignment.TopCenter),
            contentDescription = null
        )
        Image(
            painter = painterResource(id = companyIcon),
            modifier = Modifier
                .size(15.dp)
                .align(alignment = Alignment.TopStart)
                .padding(2.dp, 8.dp, 0.dp, 0.dp),
            contentDescription = null
        )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(5.dp, 0.dp, 5.dp, 15.dp)
                    .fillMaxWidth(1f)
                    .align(Alignment.BottomStart)
            ) {
                Text(
                    text = movie.name,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(1.dp)
                ) {
                    Image(
                        painter = painterResource(id = movie.ratingIcon),
                        modifier = Modifier.size(17.dp),
                        contentDescription = null
                    )
                    Text(
                        text = movie.rating,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }


            }


        }

    }