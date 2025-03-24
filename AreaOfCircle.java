// Write a Java program to print the area and perimeter of a circle.

import java.util.*;

class AreaOfCircle 
{

	public static void main(String[] args)

	{

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the radius of circle: ");

	double radius = sc.nextDouble();

	double perimeter = 2 * Math.PI * radius * radius;

	double area = radius * radius;

	System.out.println("Area of a circle: " + area);

	System.out.println("Perimeter of a circle: " + perimeter);
 

	}

}
