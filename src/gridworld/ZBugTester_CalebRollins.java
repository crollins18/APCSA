package gridworld;

/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class ZBugTester_CalebRollins
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid(20,20));
        ZBug_CalebRollins z = new ZBug_CalebRollins(4);
        z.setColor(Color.green);
        z.setDirection(Location.NORTH);
        world.add(new Location(6,2), z);
        
        ZBug_CalebRollins x = new ZBug_CalebRollins(7);
        x.setColor(new Color(83, 157, 194));
        x.setDirection(Location.EAST);
        world.add(new Location (18,8), x);
        ZBug_CalebRollins y = new ZBug_CalebRollins(3);
        y.setDirection(Location.EAST);
        world.add(new Location(13,2), y);
        
        world.show();
    }
}