package FinalAndSuperKeywords;

class Test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
	    
		//final keyword we can apply for variables or class variabls and also methods.
		
		Test t=new Test();
		//t.x=200;   //incorect,bcoz x is final variable
		System.out.println(t.x);
		

	}

}
