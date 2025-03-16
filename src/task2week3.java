//Create an enum called MovieRating with values:
//G, PG, PG13, R.
//Implement two methods:
//addRating(ArrayList<MovieRating> ratings, MovieRating rating): Adds a rating to the list.
//showRatings(ArrayList<MovieRating> ratings): Displays all stored ratings.

import java.util.ArrayList;
public class task2week3 {

    public enum MovieRating {
        G, PG, PG13, R
    }

    public static void main(String[] args) {
        ArrayList<MovieRating> ratings = new ArrayList<>();

        addRating(ratings, MovieRating.G);
        addRating(ratings, MovieRating.PG13);
        addRating(ratings, MovieRating.R);

        showRatings(ratings);
    }
    public static void addRating(ArrayList<MovieRating> ratings, MovieRating rating){
        ratings.add(rating);
    }
    public static void showRatings(ArrayList<MovieRating> ratings){
        System.out.println("Movie ratings");
        for (MovieRating rating : ratings){
            System.out.println(rating);
        }
    }
}