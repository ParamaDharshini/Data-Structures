package Day_6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	

	    int binarySearch(int a[], int l, int r, int x)
	    {
	        while (l <= r) {
	            int m = (l + r) / 2;

	            if (a[m] == x) {
	                return m;

	            
	            } else if (a[m] > x) {
	                r = m - 1;

	            
	            } else {
	              l = m + 1;
	            }  
	        }

	        
	        return -1;
	    }

	    public static void main(String args[])
	    {
	        BinarySearch ob = new BinarySearch();

	        int a[] = { 2, 3, 4, 10, 40 ,5,23};
	        int n = a.length;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter number to search");
	        int x=sc.nextInt();
	      
	        int res = ob.binarySearch(a, 0, n - 1, x);

	        if (res == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index " + res);
	    }
	}


	
	

	