package ThisAndStaticKeywords;

public class StaticDemo {
	
	static int a=10; //static variable
	int b=20;        //Non-static variable
	
	static void m1() //static method
	{
		System.out.println("this is m1 static method");
	}
	
	void m2() //Non-static method
	{
		System.out.println("this is m2 Non-static method");
	}
	
    void m() //non-static method
    {
    	System.out.println(a);
    	System.out.println(b);
    	m1();
    	m2();
    }
	

	public static void main(String[] args) {
	
	//1)static methods can access static variables and static method directly without object.
	// System.out.println(a);
    // m1();
     
     
    // System.out.println(b); "cannot access,b is non-static
    // m2(); "cannot access,m2 is non-static method
     
     
     
    // 2) static methods can access non-static variable and method through object.
     
     StaticDemo sd=new StaticDemo();
    // System.out.println(sd.b);
     //sd.m2();
     
     
     //3) non-static methods can access everything directly
      sd.m();
     
     
     
	}

}
