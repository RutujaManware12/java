package OopsConcept;

public class StudentMain {

	public static void main(String[] args)
	{
		Student stu1=new Student();
		stu1.sid=101;
		stu1.sname="smith";
		stu1.grad='A';
		
		Student stu2=new Student();
		stu2.sid=102;
		stu2.sname="Kavya";
		stu2.grad='A';
		
		stu1.printData();
		stu2.printData();
	   

	}

}
