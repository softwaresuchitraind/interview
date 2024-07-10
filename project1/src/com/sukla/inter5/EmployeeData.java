package com.sukla.inter5;
//youngest employee with minimum Salary
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class EmployeeData
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("1", 25, 1500.0);
		Employee employee2 = new Employee("2", 26, 2500.0);
		Employee employee3 = new Employee("3", 18, 500.0);
		Employee employee4 = new Employee("3", 18, 400.0);
		Employee employee5 = new Employee("4", 30, 14500.0);
		Employee employee6 = new Employee("5", 30, 15500.0);
		
		List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);
		System.out.println(employees);
	
		//employees.stream().min(Comparator.comparing(Employee::getEmpSal).thenComparing(Employee::getAge)).ifPresent(System.out::println);
		
		//oldest employee with maximum salary
		//employees.stream().max(Comparator.comparing(Employee::getEmpSal).thenComparing(Employee::getAge)).ifPresent(System.out::println);
		//oldest employee with minimum salary
		employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()
				.thenComparing(Employee::getEmpSal)).findFirst().ifPresent(System.out::println);
		
	}

}
