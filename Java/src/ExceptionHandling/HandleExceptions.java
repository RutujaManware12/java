package ExceptionHandling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		
		
		System.out.println("Program is started...");
		
		Scanner sc=new Scanner(System.in);
		
		//Example 1
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num); //if enter invalid input ex 0 then Arithmeticexception found //AritheticException
		}

        catch(ArithmeticException e)
		{
        	System.out.println("Invalid data..");
		}
		
		System.out.println("Program is Completed..");
		
		System.out.println("Program is exited...");
	}

}
