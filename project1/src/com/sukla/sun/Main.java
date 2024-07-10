package com.sukla.sun;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String id;
    int age;
    double salary;

    public Employee(String id, int age, double salary) {
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("1", 25, 1500.0),
            new Employee("2", 26, 2500.0),
            new Employee("3", 18, 500.0),
            new Employee("4", 18, 400.0),
            new Employee("5", 30, 14500.0),
            new Employee("6", 30, 15500.0)
        );

        Employee result = employees.stream()
            .sorted(Comparator.comparing(Employee::getAge).reversed()
                .thenComparing(Employee::getSalary))
            .findFirst()
            .orElse(null);

        System.out.println(result);
    }
}
