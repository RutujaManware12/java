package Inheritance;

class A   //parent class
{
	int a=100;
	void display() 
	{
		System.out.println(a);
	}
}

class B extends A  //child class
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

public class  SingleInheritance {

	public static void main(String[] args) {
		
	B bobj=new B();
	
	System.out.println(bobj.a);
	System.out.println(bobj.b);
	
	bobj.display();
	bobj.show();
		
	}

}
