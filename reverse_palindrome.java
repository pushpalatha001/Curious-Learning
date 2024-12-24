package array_based_sums;

import java.util.Arrays;

public class reverse_palindrome {
    public static void main (String args[]) {
	  int arr[] = {1, 2, 3, 4, 5};
	  int temp = 0;
	  int i=0;
	  int n=arr.length;
	  int tempArr[] = Arrays.copyOf(arr, n);
	  int j=n-1;
	  while(i<j) {
		  temp = arr[i];
		  arr[i]= arr[j];
		  arr[j] = temp;
		  i++;
		  j--;
	  }
	 
	  //System.out.print(Arrays.toString(arr));
	  
	   if(Arrays.equals(arr,tempArr)) {
		   System.out.print("true");
	   }
	   else {
		   System.out.print("False");
	   }
  }
}
