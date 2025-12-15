package org.example.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAllEmployeesWhoseSalaryGreater {

    public static void main(String[] args) {


        List<Employee> allEmployee = Employee.getAllEmployee();

        List<Employee> employee = allEmployee.stream().filter(sal -> sal.getSalary() > 50000).collect(Collectors.toList());
        System.out.println(employee);

    }


}
