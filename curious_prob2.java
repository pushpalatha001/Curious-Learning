package mytask;

import java.util.Scanner;

//write a program to check whether a traingle can be formed with the given values for the angles.
public class curious_prob2 {

	 public static void main (String args[]) {
		 int angles1;
		 int angles2;
		 int angles3;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter angles 1 ");
		 angles1= sc.nextInt();
		 System.out.println("Enter angles 2 ");
		 angles2= sc.nextInt();
		 System.out.println("Enter angles 3 ");
		 angles3= sc.nextInt();
		 int sum = angles1+angles2+angles3;
		 
		 if(sum == 180) 
		 {
			 System.out.println("Traingle can be formed ");

		 }else
		 {
			 System.out.println("Traingle canot be formed ");
		 }
	 }
}
