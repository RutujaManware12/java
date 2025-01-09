package WrapperClasses;

public class DataConversionMethods {

	public static void main(String[] args) {
	
  // A)Scenario 1
		
	//1) String convert to integer
		
	//	String s="welcome";  //Cannot convert to int
		
		/*String s1="10";
		  String s2="20";
		  System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		*/
		
		
		
	//2) String convert to Double
		
		/*String s1="10.4";
		String s2="23.4";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		
		
   //3) String convert to boolean
		
		//String s="selenium"; //other then true,if you pass any string that will return false.
		//System.out.println(Boolean.parseBoolean(s));
		
		
  // B)Scenario 2- int,double,bool ,char convert to String
		
		int a=10;
		double d=20.4;
		char c='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		
		s=String.valueOf(bool);
		System.out.println(s);
		
		
		
		
 		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
