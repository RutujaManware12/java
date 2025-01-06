package MethodsAndConstructors;

public class ConstructorDemo {

	//take same class name
	//Constructor purpose is assign data into the variables
	
	
	//default constructor
	int x,y;
	
	ConstructorDemo()  //default constructor-bcz no parameter
	{
		x=100;
		y=200;
	}
	
	
   
	
	ConstructorDemo(int a,int b)  //Parameterized constructor- parameter
	{
		x=a;
		y=b;
	}
	
	
	void sum() //one more method create form sum of the operation
	
	{
		
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
	//ConstructorDemo cd=new ConstructorDemo(); //invoke deault constructor
		
	ConstructorDemo cd=new ConstructorDemo(10,20); //Parameterized constructor
	cd.sum();

		

	}

}
