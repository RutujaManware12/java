package InterfaceAndDataAbstration;

//Interface allowed three types of methods is default,static and abstract method.

interface Shape   
{
	int Length=10;  //final & Static 
	int width=20;   //final & Static 
	
	
	 void circle(); //abstract method-There is no implementation 
	
	
	 default void square()  //Default method is any method which is having default keyword in front of it which is called default method.
	 {
		 System.out.println("This is square-default method");
	 }
	
	
	 static void rectangle()  //static method
	 
	 
	 {
		 System.out.println("This is rectangle-static method");
	 }
}


public class InterfaceDemo implements Shape
{
    public void circle()
    {
    	System.out.println("this is circle -abstract method..");
    }
	
	
	
	public static void main(String[] args) {
		
		//Scenario 1
		//InterfaceDemo idobj=new InterfaceDemo();
		//idobj.circle(); //abstract
		//idobj.square();  //default
		//Shape.rectangle();//Static method can directly access from interface.
		
		//Scenario 2
		
		Shape sh=new InterfaceDemo(); //we can create Object reference for interface but we cannot instantiate interface.
		sh.circle(); //abstract
		sh.square(); //default
		Shape.rectangle();//Static method can directly access from interface.
		
		
		
		

	}

}
