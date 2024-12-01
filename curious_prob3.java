package mytask;

import java.util.Scanner;

//given mark of student, print the grade
public class curious_prob3 
{
      
	   public static void main (String args[]) 
	   {
		   int mark;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your mark: ");
		   mark = sc.nextInt();
		   
		   if(mark >=35 )
		   {
			   if(mark>=35 && mark <=59)
			   {
				   System.out.println("Grade D");
			   }
			   else if(mark>=60 && mark <=79)
			   {
				   System.out.println("Grade C");
			   }
			   else if(mark>=80 && mark <=89)
			   {
				   System.out.println("Grade B");
			   }
			   else 
			   {
				   System.out.println("Grade A");
			   }
		   }else {
			   System.out.println("Fail");
		   }
		   
		   
		   
	   }
	
}
