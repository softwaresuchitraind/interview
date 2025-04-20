package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 		Write a java stream program to Get the names of departments and average salary of employees in each department, but
 * 		only include departments where the average salary is greater than 70000.
 * */
class Employee4
{
	private String empName;
	private String dept;
	private Double salary;

	public Employee4(String empName, String dept, Double salary)
	{
		super();
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public String getDept()
	{
		return dept;
	}

	public void setDept(String dept)
	{
		this.dept = dept;
	}

	public Double getSalary()
	{
		return salary;
	}

	public void setSalary(Double salary)
	{
		this.salary = salary;
	}

}

public class M80
{
	public static void main(String[] args)
	{
		List<Employee4> empLists = Arrays.asList(new Employee4("Alice","Engineering",85000.0),new Employee4("Bob","Engineering",72000.0),
				new Employee4("Charlie","HR",65000.0),new Employee4("David","HR",60000.0),new Employee4("Eve","Marketing",95000.0));
		
		
		Map<String, Double> highAvgSalaries = empLists.stream()
				.collect(Collectors.groupingBy(Employee4::getDept,Collectors.averagingDouble(Employee4::getSalary)))
				.entrySet()
				.stream()
				.filter(entry->entry.getValue()>70000)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		highAvgSalaries.forEach((dept,avgSalary) -> System.out.println(dept+" avg salary "+avgSalary));
		
	} 
}
