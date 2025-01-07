package ThisAndStaticKeywords;

public class StaticMain {
	
	public static void main(String[] args)
	{
		//1)static methods can access static variables and static method directly without object.
		 System.out.println(StaticDemo.a); //Class name should be defined only static variable and methods
		 
	     StaticDemo.m1();
	     
	     
	    // System.out.println(b); "cannot access,b is non-static
	    // m2(); "cannot access,m2 is non-static method
	     
	     
	     
	    // 2) static methods can access non-static variable and method through object.
	     
	     StaticDemo sd=new StaticDemo();
	    System.out.println(sd.b);
	     sd.m2();
	     
	     
	     //3) non-static methods can access everything directly
	      sd.m();
	     
	}

	private static void m1() {
		// TODO Auto-generated method stub
		
	}

}
