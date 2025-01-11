package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
	
	// Q) What is difference bet checked exceptions and unchecked exception
	//1)Checked exception are identified by java compiler where uncheked exception are not identified by java compiler
	//2)Checked exception can handle by  try catch block as by using throw keyword and unchecked exceptions we can handle only try catch block.
    //3)try catch block is statement level throws keyword is a method level.
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Program Started...");

		System.out.println("Program in progress...");
		
		Thread.sleep(5000);
		
		//FileInputStream file=new FileInputStream("C:\\TEXT.txt");
		
		
		
		/*
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
		*/
		
		
		
		System.out.println("Program finished...");

		System.out.println("Program exited....");
		
		
		

	}

}
