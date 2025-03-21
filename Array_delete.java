package day_1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_delete {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the position:");
		int delpos=sc.nextInt();
		for(int mypos=delpos-1;mypos<size;mypos++) {
			arr[mypos]=arr[mypos+1];
		}
		size--;
		System.out.println(Arrays.toString(arr));
		 
		
		
		
		
	}


}
