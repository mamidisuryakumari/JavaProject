package opp;

class Student{
	String name;
	int rollNo;
	static String newCollege = "Abc college";
	
	public void display(String name, int rollno) {
		System.out.println("Student name is:" +  name +  ", roll no is: "+ rollno + 
				" ,college name is :" + newCollege);
	}
	
	 static void setChangeCollegeName(String collegeName) {
		newCollege = collegeName;
	//	System.out.println("college name is: "+ newCollege);
		}
	
}
public class StaticExample {

	public static void main(String[] args) {
		Student student = new Student();
		student.display("Surya", 101);
		
Student.setChangeCollegeName("vkr");

student.display("Surya", 101);
		
	}
}
