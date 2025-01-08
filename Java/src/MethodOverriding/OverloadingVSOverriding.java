package MethodOverriding;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a) //1)Overriding- We can not changing declaration.2)Only method name same.
	               //3) overriding - we can achieve only inheritance.
	{
		System.out.println(a*a);//Overriding
		
	}
	
	void m2(int a,int b) //1)Overloading -we should change the declaration.2)Only method name same.
	                      //3)Overloading we can achieve with or without inheritance with single or multiple classes.
	{
		System.out.println(a+b);
	}
}

public class OverloadingVSOverriding {

	public static void main(String[] args) {
		
		XYZ xyzobj=new XYZ();
		xyzobj.m1(10);
		xyzobj.m2(40);
		xyzobj.m2(20,10);
		

	}

}
