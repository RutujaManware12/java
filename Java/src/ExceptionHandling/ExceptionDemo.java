package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc=new Scanner(System.in);
		
		//Example 1
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(100/num); //if enter invalid input ex 0 then Aritheticexception found //AritheticException
		*/
		
		
		
		//Example 2
		
		/*int a[]=new int[5];
		
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value; //ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);
		*/
		
		
		//Example 3
		
		/*String s="Welcome";
		int num=Integer.parseInt(s); //NumberFormat Exception
		System.out.println(num);
		*/
	
		
		//Example 4
		
		String s=null; 
		System.out.println(s.length());  //NullPointerException
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Program is Completed..");
		
		System.out.println("Program is exited...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
