package gridworld;

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug_CalebRollins extends Bug
{
    private int steps;
    private int sideLength;
    private int turns = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug_CalebRollins(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else if (turns == 0 && canMove())
        {
            turn();
            turn();
            turn();
            steps = 0;
            turns++;
        }
        else if (turns == 1 && canMove())
        {
            turn();
            turn();
            turn();
            turn();
            turn();
            steps = 0;
            turns++;
        }
        else {
        	
        	
        }
        
    }
}
