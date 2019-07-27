package advoop;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MovieTester_CalebRollins {

	public static void main(String[] args) 
	{
		ArrayList<Movie_CalebRollins> movies = new ArrayList<Movie_CalebRollins>();
		
		// Add at least 5 movies to the array list
		// Example: 
		movies.add(new Movie_CalebRollins("Gone with the Wind", "PG", 1940, 10, 3, 10.00));
		movies.add(new Movie_CalebRollins("Finding Dory", "PG", 2016, 20, 8, 12.00));
		movies.add(new Movie_CalebRollins("Finding Nemo", "G", 2003, 14, 6, 8.00));
		movies.add(new Movie_CalebRollins("Ratatouille", "G", 2007, 16, 9, 7.50));
		movies.add(new Movie_CalebRollins("The Lego Movie", "PG", 2014, 20, 12, 9.50));
		

		// Instantiate a MovieBox object and pass it the list of movies
		MovieBox_CalebRollins box = new MovieBox_CalebRollins(movies);
		
		// Instantiate an array list of the movies that have a certain rating
		ArrayList<Movie_CalebRollins> moviesByRating = new ArrayList<Movie_CalebRollins>();

		// Prompt for the movie rating and pass this as a parameter to your new method in the MovieBox class
		
		String ratingToSortBy =  JOptionPane.showInputDialog(null,"Enter a Rating for the movies you want to see or enter ALL for all movies.");
		moviesByRating = box.findMoviesByRating(ratingToSortBy);
		
		// Loop through the array list of movies and print each movie's name, rating, and availability to the console.
		// Remember to use the accessor methods that you have created in the Movie class.
		
		for(int i=0; i<moviesByRating.size(); i++) {
			
			String out = "The movie " + "\"" + moviesByRating.get(i).getName() + "\"" +" has a rating of " + moviesByRating.get(i).getRating() + " and there are " + moviesByRating.get(i).getTotalAvailable() + " available.";
			System.out.println(out);
			
		}
		
		String movieToCheckOut =  JOptionPane.showInputDialog(null,"Enter a movie to checkout.");
		box.checkOutMovie(movieToCheckOut);
		
		
	}

}
