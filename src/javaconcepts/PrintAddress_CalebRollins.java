package javaconcepts;

import javax.swing.JOptionPane;

// Prompt the user for first name, last name, street address, city, state, and zip code
// and print this information to the console in the format:
//       John Doe
//       110 Main Street
//       Hometown, NC 99999
//
public class PrintAddress_CalebRollins 
{
	public static void main (String[] args)
	{
		String fname = JOptionPane.showInputDialog("What is your First Name?");
		String lname = JOptionPane.showInputDialog("What is your Last Name?");
		String streetadd = JOptionPane.showInputDialog("What is your Street Address?");
		String city = JOptionPane.showInputDialog("What is your City?");
		String state = JOptionPane.showInputDialog("What is your State (abreviations please)?");
		String zip = JOptionPane.showInputDialog("What is your zip code?");
		
		System.out.print(fname);
		System.out.print(" ");
		System.out.println(lname);
		
		System.out.println(streetadd);
		
		System.out.print(city);
		System.out.print(", ");
		System.out.print(state);
		System.out.print(" ");
		System.out.print(zip);
		
		JOptionPane.showMessageDialog(null, "Thank you for entering you name and address. The FBI will follow up with you in 5-6 buisness days, if you have been selected to join the Illuminati.");




	}
}
