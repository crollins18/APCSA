package javaconcepts;

import javax.swing.JOptionPane;
import java.util.Scanner;

//Chapter 2 - convert temperatures
public class TemperatureConversion_CalebRollins 
{

	double celsius;
	double kelvin;
	double fahrenheit; 
	Scanner in = new Scanner (System.in);

	public void convertFromFahrenheit()
	{
		System.out.print("Enter a Fahrenheit Value");
		fahrenheit = in.nextDouble();
		
		celsius = (fahrenheit - 32.0) * (5.0/9.0);
		
		kelvin = (celsius) + (273.15);
		
		System.out.println(fahrenheit + " F" + " = " + celsius + " C");
		System.out.println(fahrenheit + " F" + " = " + kelvin + " K");

	}

	public void convertFromCelsius()
	{
		System.out.print("Enter a Celsius Value");
		celsius = in.nextDouble();
		
		fahrenheit = (celsius * 9.0/5.0) + 32;
		kelvin = (celsius) + (273.15);

		System.out.println(celsius + " C" + " = " + fahrenheit + " F");
		System.out.println(celsius + " C" + " = " + kelvin + " K");

		//Print a message to the console that shows the conversion
	}
	
	public void convertFromKelvin()
	{
		System.out.print("Enter a Kelvin Value");
		kelvin = in.nextDouble();
		
		fahrenheit = (kelvin - 273.15) * (9.0/5.0) + 32;
		celsius = (kelvin -273.15);
		
		System.out.println(kelvin + " K" + " = " + fahrenheit + " F");
		System.out.println(kelvin + " K" + " = " + celsius + " C");


	}

}
