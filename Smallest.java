// Write a Java program that takes three numbers from the user and prints the smallest number.

import java.io.*;
import java.util.*;

class Smallest
{
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter 1st numbers ");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd numbers ");
	int num2 = sc.nextInt();
	System.out.println("Enter 3rd numbers ");	
	int num3 = sc.nextInt();
	
	if(num1 < num2 & num2 < num3 )
	{
	System.out.println("Smallest number " + num1);
	}
	else if (num2 < num3)
	{
	System.out.println("Smallest number " + num2);

	}
	else
	System.out.println("Smallest number " + num3);

	}
	
}
