package TypeCasting;

class Parent
{
	String name="John";
	void m1()
	{
		System.out.println("This is m1 from parent..");
	}
}

class Child extends Parent
{
	int id=101;
	void m2()
	{
		System.out.println("This is m2 from child..");
	}
}


public class TypeCastingObject {

	public static void main(String[] args) {
		
		/*Child c=new Child();
		System.out.println(c.name);//parent
		c.m1(); //parent
		System.out.println(c.id); //child
		c.m2();//child
		*/
		
		
		/*Parent p=new Child(); //Upcasting
		System.out.println(p.name);//parent
		p.m1(); //parent
		//System.out.println(p.id); //We cannot access
		//p.m2();//We cannot access
		*/
		
		
		
		//DownCasting
		
		/*Parent p=new Parent();
		Child c=(Child)p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		*/
		
		
		
		
		
		
		

	}

}
