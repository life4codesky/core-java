// Write a Java program to swap two variables.

import java.util.*;

class Swap 
{

	public static void main(String[] args)
	{
		
	int a = 20; 

	int b = 50; 

	int temp;

	System.out.println("Printing values of A and B before swap: " + a + " " + b);

	temp = a; 

	a = b; 
	
	b = temp;
	
	System.out.println("Printing values of A and B after swap: " + a + " " + b);

	}

}
