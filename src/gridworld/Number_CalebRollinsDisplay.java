package gridworld;

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.world.World;
import info.gridworld.gui.DefaultDisplay;

// Since we do not want to display an Actor image in this case, we need to create an
// empty (no code) NumberDisplay class that extends DefaultDisplay.  
//
public class Number_CalebRollinsDisplay extends DefaultDisplay
{
    //Since nothing is coded here, it disregards the Actor.gif file

    //Note: If we did not extended this class and not put any code in it, the gui would have used 
    //the closest related gif file - Actor.gif in this case.
}