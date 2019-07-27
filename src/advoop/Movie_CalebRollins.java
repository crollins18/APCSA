// Movie class:
// This assignment teaches you about OOP techniques.  Specifically, you will define constructors,
// instance variables, accessor methods, modifier methods, and the toString method.

package advoop;

import static java.lang.System.*;

public class Movie_CalebRollins
{
	// Create private instance variables to store the information for a Movie
	private String movieName;
	private String rating;
	private int year;
	private int totQuantity;
	private int checkedOutQuantity;
	private String outString;
	private double price;

	
	// Create a constructor with paramters: movie name, rating, year, total quantity, and checkout quantity
	public Movie_CalebRollins(String inName, String inRating, int inYear, int inTotQuantity, int inCheckedOutQuantity, double inPrice)
	{
			movieName = inName;
			rating = inRating;
			year = inYear;
			totQuantity = inTotQuantity;
			checkedOutQuantity = inCheckedOutQuantity;
			price = inPrice;

	}

	// Create modifier methods for each instance variable
	public void setName(String inName)
	{
		
		movieName = inName;

	}
	
	public String getRating() {
		
		return rating;
	}



	// Create accessor methods for each instance variable
	public String getName()
	{
		return movieName;
	}


	
	// Create method to return the total number of copies that are available
	public int getTotalAvailable()
	{
		return totQuantity - checkedOutQuantity;
	}
	
	public double getPrice() {
		
		return price;
		
	}
	
	public void setTotalAvailable(int num) {
		
		price = num;
		
	}


	// Create a toString() method to return the string version of the movie.
	public String toString()
	{
		outString = movieName;
		return outString;
	}
}