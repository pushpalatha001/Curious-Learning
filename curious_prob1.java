package mytask;

import java.util.Scanner;

//Write a program that takes an integer ,then a string,then a char from the user and prints them in the screen.input=2 name y
public class curious_prob1
{

	public static void main (String args[])
	{
		int inte;
		String name;
		char charac ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		inte = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter an String : ");
		name = sc.nextLine();
		
		System.out.println("Enter an char : ");
		charac =sc.next().charAt(0);
		
		
	
	     System.out.println("Integer: " + inte);
	     System.out.println("String: " + name);
	     System.out.println("Character: " + charac);
		
		
		
		
	}
	
	
}
