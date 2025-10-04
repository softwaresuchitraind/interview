package javainterview17;

import java.util.Comparator;
import java.util.List;

//Sort the List of employee by department and salary

record Employee(String name,String department,int salary)
{
	
}
public class M110
{
	public static void main(String[] args)
	{
		List<Employee> employees = List.of(new Employee("Yogesh","IT",9500),
				new Employee ("Nayan","Finance",6500),
				new Employee("Mahendra","IT",7500),
				new Employee("Amol","HR",5500),
				new Employee("Kaustabh","Finance",8000)
				);
		
		List<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::department)
						  .thenComparing(Employee::salary,Comparator.reverseOrder())).toList();
		
		int index = 1;
		
		for(Employee e : sorted)
		{
			System.out.println(index++ +" ) "+ e);
		}
	}
}
