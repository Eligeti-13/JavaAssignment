class Person
{
	String name;
	private int age;
	void StorePersonData(String name, int age)
	{
		this.name = name;
		this.age = age;		
	}
	void DisplayPersonDetails()
	{
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
	}	
}
class Employee extends Person
{
	int empno;
	float salary;
	void StoreEmployeeData(int eno, float sal, String nm, int a)
	{
		empno = eno;
		salary = sal;
		StorePersonData(nm,a);
	}
	void DisplayEmployeeDetails()
	{
		System.out.println("EMPNO:"+empno);
		System.out.println("SALARY Rs:"+salary);
		DisplayPersonDetails();
	}
}
class Student extends Person
{
	int rollno;
	int marks;
	void StoreStudentData(int rno, int mr, String nm, int a)
	{
		rollno = rno;
		marks = mr;
		StorePersonData(nm,a);		
	}
	void DisplayStudentDetails()
	{
		System.out.println("ROLLNO:"+rollno);
		System.out.println("MARKS:"+marks);
		DisplayPersonDetails();		
	}
}
public class HierarchyInheritance 
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.StoreEmployeeData(1001, 45000, "Rama", 24);
		e.DisplayEmployeeDetails();
		Student s = new Student();
		s.StoreStudentData(10, 87, "Vishnu", 14);
		s.DisplayStudentDetails();	
	}
}
