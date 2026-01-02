package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee{
    int eId;
    String eName;
    int eSalary;

    public Employee(int eid,String eName,int eSalary){
        this.eId = eid;
        this.eName = eName;
        this.eSalary = eSalary;
    }
}
public class FilterAndMapDemo {
    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(1, "Surya", 50000),
                new Employee(2, "Kumar", 60000),
                new Employee(3, "Kumar", 20000),
                new Employee(4, "Kumar", 30000));

      List<Integer> empSalaryList = empList.stream().filter(e->e.eSalary>40000)
                .map(e->e.eSalary).collect(Collectors.toList());
      System.out.println(empSalaryList);
    }
}

