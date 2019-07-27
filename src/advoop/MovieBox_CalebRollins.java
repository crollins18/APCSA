package advoop;

import java.util.ArrayList;

// The MovieBox class represents a kiosk that stores movies.
public class MovieBox_CalebRollins 
{
	private ArrayList<Movie_CalebRollins> movies = new ArrayList<Movie_CalebRollins>();
	private ArrayList<Movie_CalebRollins> sortedMovies = new ArrayList<Movie_CalebRollins>();
	
	// Create a constructor method that accepts an array list of movies	
	public MovieBox_CalebRollins(ArrayList<Movie_CalebRollins> movieList)
	{
		movies = movieList;
	}
	
	// Create a method that accepts a rating and returns all of the movies that have that rating.
	// If the rating parameter is ALL then return all of the movies
	public ArrayList<Movie_CalebRollins> findMoviesByRating(String inRating)
	{
		inRating = inRating.toUpperCase();
		
		if(!(inRating.equals("ALL"))) {
			
			for (int i = 0; i<movies.size(); i++) {
				
				if (movies.get(i).getRating().equals(inRating)) {
					
					sortedMovies.add(movies.get(i));
					
					
				}
				
			}
			
		}
		
		else {
			
			sortedMovies = movies;
			
		}
		
		return sortedMovies;
		
	}
	
	public void checkOutMovie(String movieToCheckOut) {

		
		for (int i = 0; i<movies.size(); i++) {
			
			if(movies.get(i).getName().equals(movieToCheckOut) && movies.get(i).getTotalAvailable() != 0) {
				
				System.out.println("The movie " + movies.get(i).getName() + " costs $" + movies.get(i).getPrice() + " and it will be checked out now.");
				movies.get(i).setTotalAvailable(movies.get(i).getTotalAvailable() - 1);
				
			}
			
		}
		
	}
	
	
}
