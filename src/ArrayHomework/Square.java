package ArrayHomework;

import java.util.Scanner;

public class Square {
     public static void main(String[] args) 
     {
		Scanner Sc = new Scanner(System.in);
		int r[] = new int[5];
		int i;
		
		for(i=0;i<=4;i++)
		{
			System.out.println("enter value");
			r[i] = Sc.nextInt();
		}
		for(i=0;i<=4;i++)
		{
		System.out.println("Square of " + r[i]*r[i]);

		}
}}
