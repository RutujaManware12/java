package Collections;

import java.util.ArrayList;
import java.util.List;

//Heterogenious data means different type of data or different type of object or different type of elements.

public class ArrayListDemo {

	public static void main(String[] args) {
		
//Declaration
	ArrayList mylist=new ArrayList();//ArrayList is a external class which is coming from java.util package so that we have to import.  
	//List mylist=new ArrayList();
		
		
//Only homogeneous data suppose i want to store only interger type of number.
	//ArrayList <Integer>mylist=new ArrayList<Integer>();	
		
	
//Adding data into arraylist
	mylist.add(100);
	mylist.add(10.5);
	mylist.add("Welcome");
	mylist.add('A');
	mylist.add(true);
	mylist.add(null);
	mylist.add(null);
	


// Size of arraylist
	
	System.out.println("Size of an arraylist:" +mylist.size());
	
//Printing arraylist
	System.out.println("Priting data from arraylist:"+mylist);  //[100, 10.5, Welcome, A, true, null, null]
	
	
//Remove element from arraylist
	mylist.remove(5); //here 5 is index of element
	System.out.println("After removing:"+mylist);//[100, 10.5, Welcome, A, true, null]
	
	
//Insert element in the arraylist
	mylist.add(2,"java");
	System.out.println("After inserting:"+mylist);//[100, 10.5, java, Welcome, A, true, null]
	

//Modify element in the arraylist
		mylist.set(2,"python");
		System.out.println("After Replacing:"+mylist);//[100, 10.5, python, Welcome, A, true, null]	
		
//Access specifi element from arraylist
		System.out.println(mylist.get(3)); //here 3 is index
		
//Reading all the elements from arraylist
 //1) Using normal for loop
		
		/*for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
 //2) Using	for..Inhance loop
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		
//Checking arraylist is empty or not
		
		System.out.println("Is arraylist empty?"+mylist.isEmpty());
		


//Remove all the elements randomly from array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements:"+mylist); //[10.5, python, A, true, null]
		


//Remove all the elements/clear
		mylist.clear();
		System.out.println("Is arraylist empty?"+mylist.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
	}

}
