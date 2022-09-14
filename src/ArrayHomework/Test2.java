package ArrayHomework;

import java.util.Scanner;

public class Test2 {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []r=new int[5];
		int i;
		  
		for(i=0;i<=4;i++) 
		{
			System.out.println("enter value ");
			r[i] =sc.nextInt();
			
		}
		for(i=0;i<=4;i++) {
			System.out.println("value is" +r[i]);
		}
      }
}
