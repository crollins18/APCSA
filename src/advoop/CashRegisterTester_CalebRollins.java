package advoop;

import java.util.ArrayList;
import java.util.Collections;
import java.text.*;   //Needed to format double numbers to 2 places

// This driver program should create a new Money object for each currency or coin
// in a cash register (from a penny to a twenty dollar bill).
// It should then initialize the cash register with some money and print out the 
// contents of the cash register.
//
public class CashRegisterTester_CalebRollins
{
	public static void main( String[] args )
	{
		DecimalFormat decFormat = new DecimalFormat("$0.00");

		// Set up all possible types of money from a penny to a twenty dollar bill - here are a few examples:
		Money_CalebRollins fiftyDollars = new Money_CalebRollins("50 dollar bill",50.00);
		Money_CalebRollins tenDollars = new Money_CalebRollins("10 dollar bill",10.00);
		//.......
    Money_CalebRollins quarter = new Money_CalebRollins("quarter", .25);
		Money_CalebRollins nickel = new Money_CalebRollins("nickel",.05);
		Money_CalebRollins penny = new Money_CalebRollins("penny",.01);

		// Initialize the cash register by sending it an array list of money (currency/coins)
		// You can set up a loop and populate the array list that way (possibly 10 of each currency or coin)

		ArrayList<Money_CalebRollins>  cash = new ArrayList<Money_CalebRollins>();  //This is the array list of money that needs to be populated
		//.......
    for (int i=0; i<5; i++ ) {
    cash.add(fiftyDollars);
    cash.add(tenDollars);
    cash.add(quarter); }
    Collections.sort(cash);



		CashRegister_CalebRollins register = new CashRegister_CalebRollins(cash);  //Instantiates the cash register with money.

		// Show what is in cash register
		System.out.println("\n"+"The cash register contains $"+register.getTotalMoneyInRegister()+" :");
		register.printAmountInRegister();	//Shows the amount of each currency
	}
}

