package FinalAndSuperKeywords;

public class Animal{
	
	String color="White";
}

class Dog extends Animal
{
	String color="Red";
	
	void displayColor()
	{
		System.out.println(super.color); //super keyword use
	}
	
}
