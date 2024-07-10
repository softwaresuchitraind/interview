package com.sukla.tue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/*
 * print the second lowest salary of the employees whose age greater than 30
 * */
public class M2
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("1","abc",1500.0,25);
		Employee e2 = new Employee("2","mno",2500.0,18);
		Employee e3 = new Employee("3","pqr",4500.0,30);
		Employee e4 = new Employee("4","suchitra",500.0,35);
		Employee e5 = new Employee("5","sts",5500.0,40);
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
		//System.out.println(employees);
		Optional<Employee> first = employees.stream()
					//.filter(x->x.getAge()>=30)
					.sorted(Comparator.comparing(Employee::getSalary))
					.skip(1)
					.findFirst();
		
		if(first.isPresent())
		{
			//System.out.println(first.get());
		}
					
		//Filter the employess whose name starts with s
		
		List<Employee> collect = employees.stream()
				.filter(e->e.getName().startsWith("s"))
				.collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
