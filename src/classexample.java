import java.util.ArrayList;

public class classexample {

    // Enum for movie ratings
    public enum MovieRating {
        G, PG, PG13, R
    }

    public static void main(String[] args) {
        // Create an ArrayList to store movie ratings
        ArrayList<MovieRating> ratings = new ArrayList<>();

        // Add some ratings
        addRating(ratings, MovieRating.G);
        addRating(ratings, MovieRating.PG13);
        addRating(ratings, MovieRating.R);

        // Display all stored ratings
        showRatings(ratings);
    }

    // Method to add a rating to the list
    public static void addRating(ArrayList<MovieRating> ratings, MovieRating rating) {
        ratings.add(rating);
    }

    // Method to display all stored ratings
    public static void showRatings(ArrayList<MovieRating> ratings) {
        System.out.println("Movie Ratings:");
        for (MovieRating rating : ratings) {
            System.out.println(rating);
        }
    }
}
