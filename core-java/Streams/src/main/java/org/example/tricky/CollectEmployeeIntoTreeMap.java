package org.example.tricky;

import org.example.intermediate.Employee;


import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectEmployeeIntoTreeMap {

    public static void main(String[] args) {

        List<Employee> allEmployee = Employee.getAllEmployee();

        TreeMap<String, Employee> collect = allEmployee.stream().collect(Collectors.toMap(Employee::getName, x -> x, (a, b) -> a, TreeMap::new));

        System.out.println(collect);

    }

}
