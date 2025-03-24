// Write a Java program that takes three numbers from the user and prints the greatest number.

import java.io.*;
import java.util.*;

class Greatest
{
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter three numbers ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	if(num1 > num2 & num2 > num3 )
	{
	System.out.println("Greatest number " + num1);
	}
	else if (num2 > num3)
	{
	System.out.println("Greatest number " + num2);

	}
	else
	System.out.println("Greatest number " + num3);

	}
	
}