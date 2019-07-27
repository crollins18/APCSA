package gridworld;

import java.awt.Color;

import info.gridworld.actor.Actor;

// This class is used to create a Number object.  It extends Actor and can be seen
// on the same grid as a NumberBug or any other Actor.
public class Number_CalebRollins extends Actor
{
	// The important information for a Number object are the number and the color of the number text
	// Note: textColor is a special instance variable.  When it is defined, GridWorld will
	// use its value as the color of the text (in this case the number).
	private int number;
	private Color textColor;
	
	// Constructor with one parameter: the number of the object.  Set the background color to yellow and
	// the color of the number to blue.
	public Number_CalebRollins(int num)
	{
		setColor(Color.YELLOW);
		number=num;
		textColor=Color.BLUE;
	}
	
	// Constructor with two parameters: number of the object and color of the background.  
	// Set the color of the number to blue.
	public Number_CalebRollins(int num, Color color)
	{
		number=num;
		setColor(color);
		textColor = Color.BLUE;


	}

	// Constructor with 3 parameters: number of the object, color of the background, and   
	// color of the text. 
	public Number_CalebRollins(int num, Color color, Color txtColor)
	{

		number = num;
		setColor(color);
		textColor = txtColor;

	}
	
	// Accessor method for number of this Number object
	public int getNum()
	{
		return number;
	}
	
	public void setNumber(int toSet) {
		
		number=toSet;
	}
	
	
	// Since we do not want to display an Actor image in this case, we need to create an
	// empty (no code) NumberDisplay class that extends DefaultDisplay.  When this is done,
	// the getText() method is used to display the number instead of the Actor image.  If this
	// method is defined, it uses it.  If not, it will output using the toString() method.
	public String getText()
	{
		return ""+ number;
	}
	
	// Accessor method to return the color of the text
	public Color getTextColor()
	{
		return textColor;
	}
}