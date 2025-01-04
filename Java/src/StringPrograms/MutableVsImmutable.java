package StringPrograms;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//Mutable-We can change
		
		/*int a[]= {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
         */
		
		
		//Immutable - we cannot change
		
		String s=new String("welcome");
		
		System.out.println(s);       //welcome
		
		String concatstring=s.concat("to java");
		
		System.out.println(s);   
		
		System.out.println(concatstring);
		
	}

}
