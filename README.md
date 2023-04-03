# LazyRow-jetpackCompose
<p>
-Created a data class that models a netfix movie object
-created a composable ScrollableRow function that accepts a movie object to be passed to it as a parameter
-Using the ScrollableRow function designed the moviez display Screen
-Used Scaffold as the base of moviez display screen
-Added a column to arrange the components vertically
-Inside the column added a LazyColumn so that the added LazyRows items can be scrollable vertically
-Used the LazyColumn item to:
      -Add a row for the categories of moviez
      -Add the LazyRow that displays the composable objects as items(passed every instance of the data class as an item of to the LazyRow) 
-Reused the data class instances to create moviez objects under the different moviez categories <br><br><br><br><br><br><br>
##LazyRow Design <br><br><br>
</p>
<p align="center">
  <img alt="Moviez categories consuming the same data class" src="./Screenshot_20230403-233126.png" width="30%">
&nbsp; &nbsp; 
  <img alt="LazyRow uniformly scrolled to different moviez objects" src="./Screenshot_20230403-233341.png" width="30%">
  &nbsp; &nbsp;
  <img alt="LazyRow not uniformly scrolled to different moviez objects" src="./Screenshot_20230403-233546.png" width="30%">
</p>
