package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee86
{
	private String empName;
	private String dept;
	private Double salary;
	public Employee86()
	{
		
	}
	@Override
	public String toString()
	{
		return "Employee86 [empName=" + empName + ", dept=" + dept + ", salary=" + salary + "]";
	}
	public Employee86(String empName, String dept, Double salary)
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
/*
 * Given a list of Employee objects,group them by department,find the highest paid employee in each department, and list the names
 * of those employee using stream ?
 * */
public class M86
{
	public static void main(String[] args)
	{
		Employee86 emp1 = new Employee86("Alice","Engineering",120000.0);
		Employee86 emp2 = new Employee86("Bob","Engineering",115000.0);
		Employee86 emp3 = new Employee86("Charlie","HR",95000.0);
		Employee86 emp4 = new Employee86("David","HR",99000.0);
		Employee86 emp5 = new Employee86("Eve","Sales",105000.0);
		Employee86 emp6 = new Employee86("Frank","Sales",102000.0);
		
		
		List<Employee86> topEarners = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
		topEarners.stream().collect(Collectors.groupingBy(Employee86::getDept,))
		
		
		
	}
}
