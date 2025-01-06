package PolymorphismAndEncapsulation;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder addobj=new Adder(); //object created by adder class
		
        addobj.sum(); //1 method
		 
        addobj.sum(100,200); //2
        
        addobj.sum(10.5,20); //4
        
        addobj.sum(10,15.5); //3
        
        addobj.sum(10,20,30); //5
        
        //addobj.sum(10.5,20.3,15.0); Error because this type of method not available in adder class
        
		
		
		
		
		
		
		
		
		
		
	}

}
