package test;

import movie.movie;
import movie.movieItem;

public class movieTest {
    public static void main(String[] args) {
        movie myMovie = new movie();

        movieItem item1 = new movieItem("Movie One", "Director One");
        movieItem item2 = new movieItem("Movie Two", "Director Two");

        myMovie.addmovieItem(item1);
        myMovie.addmovieItem(item2);

        myMovie.printmovieDetails();
    }
}
