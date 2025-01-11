package Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Declaration
		
		HashMap map=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();

		//Adding Pairs
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"Mary");
		hm.put(104,"Scott");
		hm.put(102,"David");
		
		System.out.println(hm); //{101=John, 102=David, 103=Mary, 104=Scott}
		
		System.out.println("Size of Hashmap:"+ hm.size());//4
		
		
		//Remove the pair
		
		hm.remove(103); //103 is key of the pair
		System.out.println("After removing pair:"+ hm);
		
		
		//Access value of the key
		System.out.println(hm.get(102)); //102 is key //David
		
		
		//Get all the keys from hashmap
		System.out.println(hm.keySet()); //[101, 102, 104]
		System.out.println(hm.values()); //[John, David, Scott]
		System.out.println(hm.entrySet()); //[101=John, 102=David, 104=Scott]
		
		
		
		//Reading data from hashmap
		//Using for..each loop
		 
		for(int k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		
		
		
		
		
		
	}

}
