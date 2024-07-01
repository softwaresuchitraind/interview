package com.sukla.inter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("1", 25, 1500.0);
		Employee employee2 = new Employee("2", 26, 2500.0);
		Employee employee3 = new Employee("3", 18, 500.0);
		Employee employee4 = new Employee("4", 30, 14500.0);
		
		List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4);
		//employees.stream().sorted(Comparator.comparing(Employee::getAge),e->e)).coll
		//employees.stream().min(Comparator.comparing(Employee::getAge)).map(x->x.getSal()).forEach(System.out::Println);
		Optional<Integer> first = employees.stream().map(x->x.getAge()).sorted().findFirst();
		if(first.isEmpty())
		{
			System.out.println(first.get());
		}
		
	}

}
