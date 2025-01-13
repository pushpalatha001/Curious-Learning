package recursion_based_sums;

public class print_divisor {
	public static void main(String[] args) {
        int number = 6; 
        printDivisors(number, 1);
    }

    public static void printDivisors(int num, int current) {
        if (current > num) {
            return; //
        }

        if (num % current == 0) {
            System.out.print(current + " "); 
        }

        printDivisors(num, current + 1); 
    }
}
