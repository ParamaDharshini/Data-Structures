package day_1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_maxmin {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter"
				
				+ " array size:");
		int size=sc.nextInt();
		int n[]=new int[size];
		for(int i=0;i<size;i++)
		{
			 n[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(n));
		int max=n[0],min=n[0];
		for(int i=0;i<size;i++) 			
		{
			if(n[i]>max)
			{
				max=n[i];
			}
			
		}
		System.out.println("Maximum:"+max);
		for(int i=0;i<size;i++) 			
		{
			if(min>n[i])
			{
				min=n[i];
			}
			
		}
		System.out.println("Minimum:"+min);
		
		
	
		
	}

}
