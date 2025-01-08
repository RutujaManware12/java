package Inheritance;

class P   
{
	int p=100;
	void display() 
	{
		System.out.println(p);
	}
}

class Q extends P 
{
	int q=200;
	void show()
	{
		System.out.println(q);
	}
}

class R extends Q
{
	int r=300;
	void print()
	{
		System.out.println(r);
	}
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		
		R cobj=new R(); //object create
		
		System.out.println(cobj.p);
		System.out.println(cobj.q);
		System.out.println(cobj.r);
		
		cobj.display();
		cobj.show();
		cobj.print();
		
		
		
	}
}
