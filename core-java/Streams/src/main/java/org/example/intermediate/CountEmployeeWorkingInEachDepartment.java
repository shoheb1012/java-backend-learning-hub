package org.example.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEmployeeWorkingInEachDepartment {

    public static void main(String[] args) {

        List<Employee> allEmployee = Employee.getAllEmployee();

        Map<String, Long> collect = allEmployee.stream().collect(Collectors.groupingBy(
                Employee::getDept, Collectors.counting()
        ));
        System.out.println(collect);

        //Find the total salary paid per department.

        Map<String, Double> collect1 = allEmployee.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.summingDouble(Employee::getSalary)
        ));

        System.out.println(collect1);

       // Find employee with the highest salary using stream
         allEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1).forEach(x-> System.out.println(x));



    }
}
