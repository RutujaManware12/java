package StringPrograms;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String -immutable-immutable,cannot change original vale of
		/*String s="welcome";
		s.concat("to java");
		System.out.println(s);//welcome
         */
		
		
		
		//StringBuffer - mutable- we can change original value
		
		/*StringBuffer s=new StringBuffer("welcome");
		s.append("to java");
		System.out.println(s); //welcometo java
		*/
		
		
		//StringBuilder -mutable
		StringBuilder s=new StringBuilder("welcome");
		s.append("to java");
		System.out.println(s); //welcometo java
		
		
		
		
		
		
		
	}

}
