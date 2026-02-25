package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

        int empId;
        String empName;
        double empSalary;
        String deptName;


        Employee( int empId, String empName,double empSalary,String deptName){
            this.empId = empId;
            this.empName = empName;
            this.empSalary = empSalary;
            this.deptName = deptName;
        }

        public String getEmpName(){
            return empName;
        }

        public int getEmpId(){
            return empId;
        }

        public double getEmpSalary(){
            return empSalary;
        }

        public String getDeptName(){
            return deptName;
        }









    }
