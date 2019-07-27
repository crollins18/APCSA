package gridworld;

import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

import java.util.ArrayList;

import info.gridworld.grid.BoundedGrid;

// This class should take any string and display that string in a square grid fit to hold the string.  

public class WordSquare_CalebRollins 
{
	private World wordWorld;
	private Grid<String> gr;
	private int size;
	private int i=0;
	private int j=0;
	// Create instance variables for the grid and World (not ActorWorld), and the string being passed to it.


	public WordSquare_CalebRollins(String s)
	
	{
		size = s.length();
		
		while(i*i < size) {
			
			i++;
		}
		
		gr = new BoundedGrid(i, i);
		wordWorld = new World(gr);
		
		for (int r=0; r<(i); r++) {
			
			for (int c=0; c<(i); c++) {
				
				wordWorld.add(new Location(r,c), s.substring(j, j+1));
				if (j<s.length()-1) {
					
					j++;
				}
				else {
					
					
				}
			}
			
		}


	}

	public void show()
	{
		// Set the title and show the world with the string displayed
		wordWorld.setMessage("Word Square World!");   	  			
		wordWorld.show();			
	}
}