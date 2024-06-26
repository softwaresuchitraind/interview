package project1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//finding highest amout of salary
public class NewOne
{
	public static void main(String[] args)
	{
		
		Employee e1 = new Employee("1", 500.0);
		Employee e2 = new Employee("2", 100.0);
		Employee e3 = new Employee("3", 400.0);
		Employee e4 = new Employee("4", 800.0);
		Employee e5 = new Employee("5", 200.0);
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
		Optional<Double> first = employees.stream().map(x->x.salary).sorted(Collections.reverseOrder()).findFirst();
		if(first.isPresent())
		{
			//System.out.println(first.get());
		}
		
		Optional<Employee> collect = employees.stream().collect(Collectors.maxBy(Comparator.comparing(x->x.salary)));
		
		System.out.println(collect);
		
	}

}
class Employee
{
	String empId;
	double salary;
	public Employee(String empId, double salary)
	{
		
		this.empId = empId;
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", salary=" + salary + "]";
	}
	
	
}
