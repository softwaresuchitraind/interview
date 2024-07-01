package com.sukla.inter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeData1
{
	public static void main(String[] args)
	{
		//System.out.println("hello");
		Employee employee1 = new Employee("1", 25, 1500.0);
		Employee employee2 = new Employee("2", 26, 2500.0);
		Employee employee3 = new Employee("3", 18, 500.0);
		Employee employee5 = new Employee("5", 18, 400.0);
		Employee employee4 = new Employee("4", 30, 14500.0);
		
		List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4,employee5);
	
		/*
		Optional<Employee> youngestEmpoyee = employees.stream()
				.min(Comparator.comparing(Employee::getEmpSal)
				.thenComparing(Employee::getAge));
		youngestEmpoyee.ifPresent(System.out::println);
		*/
		Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getAge));
				min.ifPresent(System.out::println);		 
	}

}
