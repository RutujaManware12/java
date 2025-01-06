package MethodsAndConstructors;

public class GreetingsMain {

	public static void main(String[] args) {
		
		
		Greetings gr=new Greetings();
		
		gr.m1(); //hello... 1) method
		
		
		String s=gr.m2();
		System.out.println(s); //2) method //heloo how are you
        
		
		
		gr.m3("John"); //3) method //hello John
		
		
		String var=gr.m4("David");//4) method 
		System.out.println(var);//Hello  David
	}

}
