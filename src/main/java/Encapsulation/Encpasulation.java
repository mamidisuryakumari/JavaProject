package Encapsulation;

class Employee{
	String empName;
	int empAge;
	double empSalary;
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String name) {
		this.empName = name;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int age) {
		if(age>18) {
			this.empAge = age;
		}else {
			System.err.println("Age must be greater than 18");
		}
		
	}
	
	public double getEmpsalary() {
		return empSalary;
		}
	
	public void setEmpSalary(double salary) {
		this.empSalary = salary;
	}
}

public class Encpasulation {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Surya");
		employee.setEmpAge(2);
		employee.setEmpSalary(100000);
		
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpsalary());
	}

}
