package recursion_based_sums;

public class count_digits {
	static int countDigits(int n){
	    if(n==0){
	        return 0;
	    }
	    return 1 + countDigits(n/10);
	}
	    public static void main(String[] args) {
	        System.out.println(countDigits(300403));
	    }
}
