package kareltherobot;

public class SmartBot_CalebRollins extends Robot
{
	public SmartBot_CalebRollins (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}
	
	public boolean beeperIsToLeft()  
	{
		turnLeft();
		move();
		if (nextToABeeper())
		{
		turnLeft(); 
		turnLeft(); 
		move(); 
		turnLeft();
		return true;
		}

		turnLeft(); 
		turnLeft(); 
		move(); 
		turnLeft();
		return false;
	}
	
	public boolean beeperIsToRight() 
	{
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		
		if (nextToABeeper())
		{
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			turnLeft();
			return true;
		}
		
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		return false;

	}

	public boolean twoBeepersOrMoreOnCorner() 
	{
		if (nextToABeeper())
		{
			pickBeeper();
			
			if (nextToABeeper()) 
			{
				putBeeper();
				return true;
			}
			
			putBeeper();
			return false;
		}
		return false;
	}

	
	
	public void faceEast()
	{
		if (! facingEast())
		{
			turnLeft();
		}
		if (! facingEast())
		{
			turnLeft();
		}
		if (! facingEast())
		{
			turnLeft();
		}
	}

	public void faceWest()
	{
		if (! facingWest()) 
		{
			turnLeft();
		}
		if (! facingWest()) 
		{
			turnLeft();
		}
		if (! facingWest()) 
		{
			turnLeft();
		}

	}

	public void faceSouth()
	{
		if (! facingSouth())
		{
			turnLeft();
		}
		if (! facingSouth())
		{
			turnLeft();
		}
		if (! facingSouth())
		{
			turnLeft();
		}

	}

	public void faceNorth()
	{
		if (! facingNorth())
		{
			turnLeft();
		}
		if (! facingNorth())
		{
			turnLeft();
		}
		if (! facingNorth())
		{
			turnLeft();
		}

	}

}
