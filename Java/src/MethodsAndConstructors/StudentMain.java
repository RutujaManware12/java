package MethodsAndConstructors;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		
		//Student stu=new Student();
		
		//1)Store data using object reference variables
		/*
		stu.sid=101;
		stu.sname="John";
		stu.grad='A';
		stu.printStudentData();  //call method
		*/

		 //2) Using method
		/*stu.setStudentData(101,"David",'A');
		stu.printStudentData();
		*/
		
		//3) Using constructor - We prefer the constructor to assign the data into the variabls
		
		Student stu=new Student(101,"Rutuja",'A');
		stu.printStudentData();
		
		
	}

}
