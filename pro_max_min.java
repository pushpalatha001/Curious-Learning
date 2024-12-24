package array_based_sums;

public class pro_max_min {
    public static void main (String args[]) {
    	int arr1[] = {5, 7, 9, 3, 6, 2};
    	int arr2[] = {1, 2, 6, 1, 9};
    	int large = arr1[0];
    	int small = arr2[0];
    	int pro_min_max;
    	for(int i=0;i<arr1.length-1;i++) {
    		if(large < arr1[i]) {
    			large = arr1[i];
    		}
    	}
    	//System.out.println(large);
    	
    	for(int i=0;i<arr2.length-1;i++) {
    		if(small > arr2[i]) {
    			small = arr2[i];
    		}
    	}
    	//System.out.println(small);
    	
    	pro_min_max = large *  small;
    	System.out.println(pro_min_max);
    }
    
}
