package ExceptionHandling;

public class CheckedExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program Started...");

		System.out.println("Program in progress...");
		
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
		
		System.out.println("Program finished...");

		System.out.println("Program exited....");
		
		
		

	}

}
