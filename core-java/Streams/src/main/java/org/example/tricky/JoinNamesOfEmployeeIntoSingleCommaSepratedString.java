package org.example.tricky;

import org.example.intermediate.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class JoinNamesOfEmployeeIntoSingleCommaSepratedString {
    public static void main(String[] args) {

        List<Employee> allEmployee = Employee.getAllEmployee();

        String EmployeeNames = allEmployee.stream().map(x -> x.getName()).collect(Collectors.joining(","));

        System.out.println(EmployeeNames);

    }
}
