package javaconcepts;

import javax.swing.JOptionPane;
import java.util.Scanner;

//Chapter 2 - convert temperatures
public class TemperatureConversionTester_CalebRollins 
{

	public static void main (String[] args)
	{
		TemperatureConversion_CalebRollins tempConv = new TemperatureConversion_CalebRollins();
		tempConv.convertFromFahrenheit();
		tempConv.convertFromCelsius();
		tempConv.convertFromKelvin();
	
	}
}
