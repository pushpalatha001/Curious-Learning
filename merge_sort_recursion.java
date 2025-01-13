package recursion_based_sums;

import java.util.Arrays;

public class merge_sort_recursion {

	 public static void main(String[] args) {
	        int a[] = {10, 5, 12, 1, 3, 17, 45};
	        int l = 0, h = a.length - 1;

	        mergeSort(a, l, h);

	        System.out.println(Arrays.toString(a));
	    }

	    public static void mergeSort(int[] a, int l, int h) {
	        if (l < h) {
	            int mid = l + (h - l) / 2;

	            mergeSort(a, l, mid);
	            mergeSort(a, mid + 1, h);

	            merge(a, l, mid, h);
	        }
	    }

	    public static void merge(int[] a, int l, int mid, int h) {
	        int n = mid - l + 1;
	        int m = h - mid;

	        int[] left = new int[n];
	        int[] right = new int[m];

	        for (int i = 0; i < n; i++) left[i] = a[l + i];
	        for (int i = 0; i < m; i++) right[i] = a[mid + 1 + i];

	        int i = 0, j = 0, k = l;

	        while (i < n && j < m) {
	            if (left[i] <= right[j]) {
	                a[k] = left[i];
	                i++;
	            } else {
	                a[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n) {
	            a[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < m) {
	            a[k] = right[j];
	            j++;
	            k++;
	        }
	    }
}
