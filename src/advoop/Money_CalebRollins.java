package advoop;

public class Money_CalebRollins implements Comparable
{
	private String type;	//type of currency
	private double value;	//value of money
	
	public Money_CalebRollins(String moneyType, double val)
	{
		
		value = val;
		type = moneyType;

	}
	
	public int compareTo(Object obj)
	{
		// Create a compareTo() method to determine how to compare a Money object.
		// Use the value of the money to determine whether it is less than, equal, or 
		// greater than the other money

		Money_CalebRollins other = (Money_CalebRollins) obj;
		
		if (value < other.value)
			return -1;
		if (value > other.value)
			return 1;
		return 0;


	}
	
	public boolean equals(Object obj)
	{
		Money_CalebRollins other = (Money_CalebRollins) obj;
		if (value == other.value)
			return true;
		return false;
	}
	
	public double getValue()
	{
		return value;

	}
	
	public String getType()
	{
		return type;

	}
	
	public String toString()
	{
		return "$" + String.valueOf(value);


	}
}
