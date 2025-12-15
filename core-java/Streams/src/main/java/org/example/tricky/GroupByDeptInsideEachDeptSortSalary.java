package org.example.tricky;

import org.example.intermediate.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByDeptInsideEachDeptSortSalary {

    public static void main(String[] args) {

        List<Employee> allEmployee = Employee.getAllEmployee();

        Map<String, List<Employee>> result =
                allEmployee.stream()
                        .collect(Collectors.groupingBy(Employee::getDept)) // Group by dept
                        .entrySet()
                        .stream()
                        .map(entry -> {
                            String dept = entry.getKey();

                            List<Employee> sortedList = entry.getValue()
                                    .stream()
                                    .sorted(Comparator.comparing(Employee::getSalary))
                                    .collect(Collectors.toList());

                            return Map.entry(dept, sortedList);
                        })
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);



    }
}
