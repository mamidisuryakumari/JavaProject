package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class MediumStreams {

    List<Employee> employeeList = Arrays.asList(
            new Employee(1, "Surya", 60000, "Dev"),
            new Employee(2, "Kumar", 40000, "Testing"),
           // new Employee(3, "Kitti", 70000, "Testing"),
            new Employee(4,"Ravi",30000,"Dev"),
            new Employee(3, "Chitti", 70000, "Testing"));

    List<Integer>  numberList = Arrays.asList(1,5,6,8,9,10);


    //  Group employees by department name using streams.
    public void groupEmployeesByDept() {
        Map<String, List<Employee>> empNamesByDept =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDeptName));

        empNamesByDept.forEach((dept, employees) -> {
            System.out.println("Department " + dept);
            employees.forEach(e ->
                    System.out.println("Name : " + e.getEmpName() +
                            " Id : " + e.getEmpId() + " Salary : " + e.getEmpSalary()));
        });
    }
    //Group employees by department and find highest salary in each department.
    public void groupByDeptAndFindHighestSalary(){
        Map<String, Optional<Employee>> result =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDeptName
                        ,Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary))));
        result.forEach((dept,employees) ->{
            employees.ifPresent(e->
                       System.out.println(dept + " "+ e.getEmpName() + " " + e.getEmpSalary()));
        });
    }

    //Given a list of employees (id, name, salary), find all employees whose salary is greater than 50,000.

    public void employeeSalaryGreaterThan50K() {
        List<Employee> empSalaryList = employeeList.stream()
                .filter(s -> s.empSalary > 50000)
                .collect(Collectors.toList());
        empSalaryList.forEach(e -> System.out.println(
                e.empId + " " + e.empName + " " + e.empSalary));





}

//Find seacond highest salary
    public void findSecondHighestSalary(){
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEmpSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(emp -> System.out.println(
                        emp.getEmpName() + " " + emp.getEmpId() + " " + emp.getEmpSalary()
                ));
    }

    //Find Nth highest number using streams.
    public void findNthHighestNumber(int n ){
        numberList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);
    }

    //Find Nth highest salary from employee list.
    public void findNthHighestSalary(int n){
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEmpSalary).reversed())
                .skip(n-1)
                .findFirst()
                .ifPresent(emp->System.out.println
                        (emp.getEmpName() + " " + emp.getEmpSalary()));
    }

    //Find employees with same salary.
    public void findSameSalaryOfEmployees(){
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getEmpSalary))
                .values()
                .stream()
                .filter(list -> list.size() >1)
                .flatMap(List::stream)
                .forEach(emp-> System.out.println(
                        emp.getEmpName() + " " +emp.getEmpSalary()
                ));
    }

public void findAllNthHighestSalary(int n){
    employeeList.stream()
            .map(Employee::getEmpSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(n - 1)
            .findFirst()
            .ifPresent(nthSalary ->
                    employeeList.stream()
                            .filter(emp -> emp.getEmpSalary() == nthSalary)
                            .forEach(emp ->
                                    System.out.println(
                                            emp.getEmpName() + " " + emp.getEmpSalary()
                                    )
                            )
            );
}

//Sort employees by salary and then by name.
    public void sortEmployeeSalaryAndName(){
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEmpSalary).
                        thenComparing(Employee::getEmpName))
                .forEach(e-> System.out.println(e.getEmpName() + " " +e.getEmpSalary()));

    }



    public static void main(String[] args) {
        MediumStreams mediumStreams = new MediumStreams();
        mediumStreams.groupByDeptAndFindHighestSalary();

    }
}
