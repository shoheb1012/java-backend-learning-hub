package org.example.advance;

import org.example.intermediate.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {

        List<Employee> allEmployee = Employee.getAllEmployee();

        Map<String, Double> collect =
                allEmployee.stream().collect(Collectors.toMap(
                Employee::getName,
                Employee::getSalary,
                (oldVal, newVal) -> oldVal));

        System.out.println(collect);

        //Reverse sort by multiple fields (salary desc, id asc).

        List<Employee> collect1 = allEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getId)).collect(Collectors.toList());


        System.out.println(collect1);
    }
}
