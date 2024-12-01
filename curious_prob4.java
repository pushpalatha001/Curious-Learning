package mytask;

import java.util.Scanner;

//Write a program using switch case which takes a value and prints the respective size.
public class curious_prob4 
{

	    public static void main (String args[]) 
	    {
	    	int size;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your size: ");
			size = sc.nextInt();
			
			switch(size) 
			{
			case 29 : 
				System.out.println("small");
				break;
			case 30 : 
				System.out.println("Medium");
				break;
			case 38 : 
				System.out.println("Large");
				break;
			case 42 : 
				System.out.println("XLarge");
				break;
			default :
				System.out.println("Invalid");
				
			}
			
			
	    }
}
