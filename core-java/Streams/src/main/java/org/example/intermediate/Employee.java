package org.example.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Employee {


    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept, salary);
    }

    public static List<Employee> getAllEmployee()
    {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Amit", "IT", 60000),
                new Employee(102, "Vikas", "Finance", 45000),
                new Employee(103, "John", "IT", 70000),
                new Employee(104, "Neha", "HR", 55000),
                new Employee(105, "Priya", "Finance", 75000),
                new Employee(106, "Sameer", "IT", 30000),
                new Employee(107, "Kiran", "HR", 52000),
                new Employee(108, "Mahesh", "Sales", 65000),
                new Employee(109, "Ravi", "Sales", 40000),
                new Employee(110, "Sneha", "Finance", 80000)
        );
        return employees;
    }
}
