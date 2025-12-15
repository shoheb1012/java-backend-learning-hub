package org.example.tricky;

import org.example.intermediate.Employee;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class DiffBetweenHighestAndLowestSalary {

    public static void main(String[] args) {


        List<Employee> allEmployee = Employee.getAllEmployee();
        double highestSalary = allEmployee.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary();
        double lowestSalary = allEmployee.stream().min(Comparator.comparing(Employee::getSalary)).get().getSalary();

        System.out.println(highestSalary-lowestSalary);


        DoubleSummaryStatistics stats =
                allEmployee.stream()
                        .collect(Collectors.summarizingDouble(Employee::getSalary));

        double diff = stats.getMax() - stats.getMin();

        System.out.println(diff);
    }
}
