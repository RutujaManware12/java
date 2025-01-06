package MethodsAndConstructors;

public class Student {

	int sid;
	String sname;
	char grad;
	
	//1) method - Print data of the variables
	
	void printStudentData()
	{
		System.out.println(sid+"   "+sname+"    "+grad);
		
	}
	
	
	
	//2) method - Store the data in the variables through the method
	
	void setStudentData(int id,String name,char gr) //taking 2 parameters in inside the methods
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	
	//3) using constructor
	
	Student(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	
	
	
	
	
	
	
}

