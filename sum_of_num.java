package recursion_based_sums;

public class sum_of_num {
	static int countsum(int n){
		   if(n==0) {
		        return 0;
		   }  
		    return (n%10) + countsum(n/10);

		}
    
    public static void main(String[] args) {
        System.out.println(countsum(342));
    }
}
