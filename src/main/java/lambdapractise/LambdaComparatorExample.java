package lambdapractise;

import java.util.Arrays;
import java.util.List;

class Employee{

    int age;
    String name;

    Employee(int age,String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Employee{name =" + name + ", age =" + age + "}";
    }

}

public class LambdaComparatorExample {

    public static void main(String[] args){
        List<Employee> employeeList = Arrays.asList(
                new Employee(36,"Kumar"),
                new Employee( 35,"Surya"),
                new Employee(40,"Ram"));

        employeeList.sort((e1,e2) -> Integer.compare(e1.age,e2.age));
System.out.println(employeeList);

employeeList.sort((e1,e2) -> e1.name.compareTo(e2.name));


    }
}
