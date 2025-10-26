package javainterview17;
/*
 * Group the staff members by department and calculate the average salary using stream
 * */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Staff
{
	String name;
	String department;
	int salary;
	
	Staff(String name,String department,int salary)
	{
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public String getName()
	{
		return this.name;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public int getSalary()
	{
		return this.salary;
	}
}

public class M125
{
	public static void main(String[] args)
	{
		List<Staff> staffList = Arrays.asList(
				new Staff("Yogesh","IT",95000),
				new Staff("Nayan","Finance",65000),
				new Staff("Mahendra","IT",75000),
				new Staff("Amol","HR",55000),
				new Staff("Kaustubh","Finance",80000)
				);
		
		Map<String, Double> averageSalaryDept = staffList.stream().collect(Collectors.groupingBy(Staff::getDepartment,Collectors.averagingInt(Staff::getSalary)));
		
		//System.out.println(averageSalaryDept);
		averageSalaryDept.forEach((dept,avg)->System.out.println(dept+"-"+avg ));
		
	}
}
