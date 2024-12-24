package maths_basic;

public class smallest_ele_array {
   public static void main (String args[]) {
	 int  n = 8;
     int [] a = { 5 ,7 ,34 ,67 ,2 ,56, 5 ,8};
     int smallest =a[0];
     for(int i=0;i<n;i++) {
    	 if(smallest > a[i]) { 
    		 smallest = a[i];
    	 }
     }
    System.out.println(smallest);

   }
}
