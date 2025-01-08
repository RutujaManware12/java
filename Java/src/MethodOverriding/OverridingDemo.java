package MethodOverriding;   // Overriding is we created in the parent class same method we recreated without changing the declaration just by changing the implementation



class Bank    //Parent class
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank //Child 1 class
{
	double roi()
	{
		return 110;
	}
}

class SBI extends Bank //Child 2 class
{
	double roi()
	{
		return 11.30;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		ICICI IC=new ICICI();
		System.out.println(IC.roi());
		
		
		SBI sb=new SBI();
		System.out.println(sb.roi());
				

	}

}
