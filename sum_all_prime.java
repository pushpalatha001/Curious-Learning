package array_based_sums;

//import java.util.ArrayList;

public class sum_all_prime {
	public static void main(String args[]) {
		int L= 10 ,R=20,sum = 0;
        boolean[] isPrime = new boolean[R];
       // ArrayList<Integer> primes = new ArrayList<>();
        //int arr[] = new int[R];
         for (int i = 2; i < R; i++) {
            isPrime[i] = true;
        }
        for(int i=2;i*i<R;i++){
            if(isPrime[i]){
                for(int j=i*i;j<R;j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=Math.max(L, 2);i<R;i++){
        	
            if(isPrime[i]){
                //primes.add(i);
            	sum =sum+i;
               
            }
        }
       
        System.out.println("Sum of primes between " + L + " and " + R + ": " + sum);

       
        
    }
	
}
