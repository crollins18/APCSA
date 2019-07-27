package gridworld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

// Extend the Bug class to make a NumberBug that will move around the grid just like 
// a Bug.  NumberBug will drop increasing numbers instead of Flowers.  If the 
// NumberBug cannot move, but one of its adjacent locations is open, the NumberBug 
// should simply turn (like a normal Bug).  However, if the NumberBug is surrounded 
// on all sides by objects, then it should move to the first open location in the grid.  
// In this case, if there are no open locations in the grid, then it should simply turn.  
// You may need to override the act(), move(), and turn() methods. 
//
public class NumberBug_CalebRollins extends Bug
{
	// The number instance variable keeps track of the Number object that the bug drops
	private Number_CalebRollins number;
	private int steps;

	
	// This constructor method with no parameters will create an orange bug.  
	// Number starts as 0.
	public NumberBug_CalebRollins()
	{
		super(Color.ORANGE);
		number = new Number_CalebRollins(0, getColor());
	}
	
	// This constructor method with one parameter will create an orange bug.  
	// Integer parameter num is the starting number.
	public NumberBug_CalebRollins(int num)
	{
		super(Color.ORANGE);
		number = new Number_CalebRollins(num, getColor());

	}

	// This constructor method with two parameters will create a bug of the color specified.  
	// Integer parameter num is the starting number.
	public NumberBug_CalebRollins(int num, Color color)
	{
		super(color);
		number = new Number_CalebRollins(num, getColor());
		

	}
	
	// This constructor method with 3 parameters will create a bug of the color specified.  
	// Integer parameter num is the starting number.
	// txtColor is the color of the number
	public NumberBug_CalebRollins(int num, Color color, Color txtColor)
	{
		super(color);
		number = new Number_CalebRollins(num, getColor(), txtColor);

	}	
	
	// This method is used to drop the number behind the NumberBug when it moves away from a cell.
	// It also should construct a new Number object using 3 parameters.
	public void leaveNumberBehind(Grid<Actor> grid, Location loc)
	{
		Number_CalebRollins temp = new Number_CalebRollins(number.getNum()+steps, number.getColor(), number.getTextColor());
		grid.put(loc, temp);
	}
	
	// Override the act() method if necessary
	public void act()
	{
		
		Grid gr = getGrid();
		ArrayList<Location> empty = new ArrayList<Location>();
		if (canMove()) {
		Location start = getLocation();
		super.act();
		leaveNumberBehind(gr, start);
		steps = steps + 1;
		}
	
		else {
			if(getGrid().getEmptyAdjacentLocations(getLocation()).equals(empty)) {
				moveTo(getFirstEmptyLocation());
			}
			else {
				super.turn();

			}
		}
	}


	// Create this method to return the first empty location in the grid.  This method
	// should only be called if the NumberBug is stuck (has no empty cells around it).
	public Location getFirstEmptyLocation()
	{
		 ArrayList<Location> emptyLocs = new ArrayList<Location>();
         for (int i = 0; i < getGrid().getNumRows(); i++)
             for (int j = 0; j < getGrid().getNumCols(); j++)
             {
                 Location loc = new Location(i, j);
                 if (getGrid().get(loc) == null)
                     emptyLocs.add(loc);
             }
		return emptyLocs.get(0);
	}
}