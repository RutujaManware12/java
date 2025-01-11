package TypeCasting;

//1) Upcasting -Converting value from smaller to larger
//ex.int--->long
//ex.float--->double


//2) downcasting - converting value from larger to smaller.
//ex.long-->int
//ex.double-->float



public class TypeCastingConcept {

	public static void main(String[] args) {
	
	//upcasting - automatic --smaller to larger	
		
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		*/
		
		/*float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		*/
		
		
		/*int i=100;
		double d=i;
		System.out.println(d);
		*/
		
		
		
		
  //downcasting - manually --larger to smaller
	
		/*long longvalue=10000;
		int intvalue=(int)longvalue;
		System.out.println(intvalue);
		*/
		
		//double doublevalue=234.56;
		//float floatvalue=(float) doublevalue;
		
		double d=13.5;
		int i=(int)d;
		System.out.println(i);
		
		
		
		
		

	}

}
