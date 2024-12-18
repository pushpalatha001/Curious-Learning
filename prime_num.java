package maths_basic;

public class prime_num 
{

	public static void main(String args[]) 
	{
		int n=5;
		for(int num = 2; num  <= n;num++)
		{
			boolean isprime = true;
		
		for(int i=2;i*i<=num;i++) 
		{
			if(num%i==0) 
			{
				isprime = false;
				break;
			}
		}
		
		if (isprime)
		{
            System.out.print(num + " ");
        }
		
		}
	}
}
