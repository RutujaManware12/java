package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1 : length() , charAt()
		
		/*String s="Welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
       System.out.println("Reverse String is:"+rev);
       */
       
       
       
       //Approach 2: by converting string to char array type
       
		/*String s="welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
       System.out.println("Reverse string is:"+rev);
       */
		
		
		
		//Approach 3:Using StringBuffer Class
		
		/*StringBuffer s=new StringBuffer("Welcome");
		System.out.println("Reverse string is:"+s.reverse());
       */
       

		//Approach 4:Using StringBuilder Class
		
		StringBuilder s=new StringBuilder("Welcome");
		System.out.println("Reverse string is:"+s.reverse());
       
	}

}
