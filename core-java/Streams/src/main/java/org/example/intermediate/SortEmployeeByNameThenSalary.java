package org.example.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployeeByNameThenSalary {

    public static void main(String[] args) {

        List<Employee> allEmployee = Employee.getAllEmployee();
        List<Employee> sortedEmployee = allEmployee.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());

        System.out.println(sortedEmployee);

    }
}
