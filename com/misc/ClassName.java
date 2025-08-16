package com.misc;

public class ClassName
{
	// Data members
	// Constructor functions
	// User-defined methods
	public static void main(String[] arguments)
	{
		printSum(1, 2, 3, 4);
	}

	private static void printSum(int... numbers)
	{
		int sum = 0;
		for (int number : numbers)
		{
			System.out.println("Sum: " + sum +" Number: "+ number);
			sum += number;
			System.out.println("Sum: " + sum);
		}
		System.out.println("Sum: " + sum);
	}
}
