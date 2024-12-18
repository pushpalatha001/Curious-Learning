package maths_basic;

public class reverse_num {


	public static void main (String args[])
	{
		int n = 987987,rem;
		while(n>0) {
			rem=n%10;
			n=n/10;
			System.out.print(rem); 
		}
		
	}
}
