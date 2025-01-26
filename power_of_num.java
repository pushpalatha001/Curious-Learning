package recursion_based_sums;

public class power_of_num {
	
    static int power(int base, int exponent) {
        
        if (exponent == 0) {
            return 1;
        }
      
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        int input = 23;
        int base = input / 10;    
        int exponent = input % 10; 

        int result = power(base, exponent);

        System.out.println(result);
    }
}
