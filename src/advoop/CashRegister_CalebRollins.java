package advoop;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.text.*;   //Needed to format double numbers to 2 places

// Create a CashRegister class that represents the cash register and its contents.  The CashRegister class 
// will keep track of the different currency and coins in the cash register.  You need a method to 
// tell you what money is in the cash register.
//

public class CashRegister_CalebRollins 
{
	// Create instance variables to keep track of the money (each currency/coin) in the cash register, 
	// the money (each currency/coin) received,
	// and the purchase amount 	


	private ArrayList<Money_CalebRollins> money = new ArrayList<Money_CalebRollins>(); // This keeps track of all the money in the register

	private DecimalFormat moneyFormat = new DecimalFormat("$0.00");  // Money format: 2 decimals with $
	private DecimalFormat decFormat = new DecimalFormat("#.##");     // Decimal format: 2 decimals
	
  private double pennyIn;
	private double nickelIn;
	private double dimeIn;
	private double quarterIn;
	private double oneDollarIn;
	private double fiveDollarIn;
	private double tenDollarIn;
	private double twentyDollarIn;
	private double fiftyDollarIn;
	private double hundredDollarIn;
	private double totMonIn;
	
	private int pennyRecieved;
	private int nickelRecieved;
	private int dimeRecieved;
	private int quarterRecieved;
	private int oneDollarRecieved;
	private int fiveDollarRecieved;
	private int tenDollarRecieved;
	private int twentyDollarRecieved;
	private int fiftyDollarRecieved;
	private int hundredDollarRecieved;

	public CashRegister_CalebRollins(ArrayList<Money_CalebRollins> startMoney)
	{
		// This is the constructor.  The array list parameter is full of Money objects.  Since the money 
		// needs to be separated, you will need to sort the money array list in reverse order.
		// This ArrayList can be sorted since Money implements Comparable and and the compareTo method is defined
		
    money = startMoney;
	}
	
	public double getTotalMoneyInRegister()
	{
		for (int i=0; i<money.size(); i++) {
			
			totMonIn = totMonIn + money.get(i).getValue();
			
		}
		return totMonIn;
	}

	public void printAmountInRegister()
	{
		double ahead;
    double current;

    for (int i=0; i<money.size(); i++) {

      if (i+1 != money.size()) {
      ahead = money.get(i+1).getValue();
      }

      else {
        ahead = 999.9;
        }

      current = money.get(i).getValue();

      if (ahead == current) {

        if (ahead == 0.01) {

          pennyIn = pennyIn + 0.01 + 0.01;
          pennyRecieved = pennyRecieved + 2;

        }

        if (ahead == 0.05) {

          nickelIn = nickelIn + 0.05 + 0.05;
          nickelRecieved = nickelRecieved + 2;

        }

        if (ahead == 0.10) {

          dimeIn = dimeIn + 0.10 + 0.10;
          dimeRecieved = dimeRecieved + 2;

        }

        if (ahead == 0.25) {

          quarterIn = quarterIn + 0.25 + 0.25;
          quarterRecieved = quarterRecieved + 2;

        }


        if (ahead == 1.00) {

          oneDollarIn = oneDollarIn + 1.00 + 1.00;
          oneDollarRecieved = oneDollarRecieved + 2;

        }

        if (ahead == 5.00) {

          fiveDollarIn = fiveDollarIn + 5.00 + 5.00;
          fiveDollarRecieved = fiveDollarRecieved + 2;

        }

        if (ahead == 10.00) {

          tenDollarIn = tenDollarIn + 10.00 + 10.00;
          tenDollarRecieved = tenDollarRecieved + 2;

        }

        if (ahead == 20.00) {

          twentyDollarIn = twentyDollarIn + 20.00 + 20.00;
          twentyDollarRecieved = twentyDollarRecieved + 2;

        }

        if (ahead == 50.00) {

          fiftyDollarIn = fiftyDollarIn + 50.00 + 50.00;
          fiftyDollarRecieved = fiftyDollarRecieved + 2;

        }

        if (ahead == 100.00) {

          hundredDollarIn = hundredDollarIn + 100.00 + 100.00;
          hundredDollarRecieved = hundredDollarRecieved + 2;

        }
        
        i++;

      }

      if (ahead > current) {

        if (current == 0.01) {

          pennyIn = pennyIn + 0.01;
          pennyRecieved = pennyRecieved + 1;

        }

        if (current == 0.05) {

          nickelIn = nickelIn + 0.05;
          nickelRecieved = nickelRecieved + 1;

        }

        if (current == 0.10) {

          dimeIn = dimeIn + 0.10;
          dimeRecieved = dimeRecieved + 1;

        }

        if (current == 0.25) {

          quarterIn = quarterIn + 0.25;
          quarterRecieved = quarterRecieved + 1;

        }

        if (current == 1.00) {

          oneDollarIn = oneDollarIn + 1.00;
          oneDollarRecieved = oneDollarRecieved + 1;

        }

        if (current == 5.00) {

          fiveDollarIn = fiveDollarIn + 5.00;
          fiveDollarRecieved = fiveDollarRecieved + 1;

        }

        if (current == 10.00) {

          tenDollarIn = tenDollarIn + 10.00;
          tenDollarRecieved = tenDollarRecieved + 1;

        }

        if (current == 20.00) {

          twentyDollarIn = twentyDollarIn + 20.00;
          twentyDollarRecieved = twentyDollarRecieved + 1;

        }

        if (current == 50.00) {

          fiftyDollarIn = fiftyDollarIn + 50.00;
          fiftyDollarRecieved = fiftyDollarRecieved + 1;

        }

        if (current == 100.00) {

          hundredDollarIn = hundredDollarIn + 100.00;
          hundredDollarRecieved = hundredDollarRecieved + 1;

        }


      }


    }

    System.out.println("100 dollar bill amount: $" + hundredDollarIn);
    System.out.println("50 dollar bill amount: $" + fiftyDollarIn);
    System.out.println("20 dollar bill amount: $" + twentyDollarIn);
    System.out.println("10 dollar bill amount: $" + tenDollarIn);
    System.out.println("5 dollar bill amount: $" + fiveDollarIn);
    System.out.println("one dollar bill amount: $" + oneDollarIn);
    System.out.println("quarter amount: $" + quarterIn);
    System.out.println("dime amount: $" + dimeIn);
    System.out.println("nickel amount: $" + nickelIn);
    System.out.println("penny amount: $" + pennyIn);




	}
}
