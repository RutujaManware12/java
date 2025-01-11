package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Declaration 
		
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet <String>myset=new HashSet<String>();
		
		
		//Adding elements in to hashset
		myset.add(100);
		myset.add(10.3);
		myset.add("Welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
	//Printing hashset
		System.out.println(myset);//[null, A, 100, Welcome, 10.3, true]
	
		
	//Size of hashset
		System.out.println("Size of hashset:"+myset.size());//6
		
		
		
	//Removing element
		myset.remove(10.3); //10.3 is value(not an index)
		System.out.println("After removing:"+myset);//[null, A, 100, Welcome, true]
		
	//Inserting element- Not possible
		
	//Access specific element - Not Possible
		
		
   // But we Convert HashSet to ArrayList we can access specific value in hashset list

		ArrayList a1=new ArrayList(myset);
		System.out.println(a1);//[null, A, 100, Welcome, true]
		System.out.println(a1.get(2));
		
   //Read all the elements only using for..each/enhance loop 
		for(Object x:myset)
		{
			System.out.println(x);
			
			
   //Clearing all the elements in hashset
			
			myset.clear();
			System.out.println(myset.isEmpty());//true
			
			
			
			
			
			
			
			
			
			
		}

	}

}
