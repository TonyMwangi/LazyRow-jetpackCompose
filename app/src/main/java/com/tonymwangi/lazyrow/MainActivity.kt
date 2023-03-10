package com.tonymwangi.lazyrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    LazyRow(modifier = Modifier.fillMaxWidth(1f),) {
                        items(movies) { movie ->
                            ScrollableRow(movie)
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
        image = R.drawable.titanic,
        name = "Titanic",
        ratingIcon = R.drawable.rating,
        rating = "5.0"
    ),
)

@Composable
fun ScrollableRow(movie : Movies) {
    Box(
        modifier = Modifier
            .width(250.dp)
            .height(170.dp)
            .clip(shape = RoundedCornerShape(5.dp))
            .padding(8.dp)
            .background(Color.White)
    )
    {

        Image(
            painter = painterResource(id = movie.image),
            modifier = Modifier
                .width(250.dp)
                .height(150.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .align(alignment = Alignment.BottomStart),
            contentDescription = null
        )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(1f)
            ) {
                Text(
                    text = movie.name,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(1.dp)
                ) {
                    Image(
                        painter = painterResource(id = movie.ratingIcon),
                        modifier = Modifier.size(18.dp),
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

    }