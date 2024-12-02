package javainterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Oldest Employee minimum salary
public class M26
{
	public static void main(String[] args)
	{
		Employee1 employee1= new Employee1("abc", 25, 15000.0);
		Employee1 employee2= new Employee1("def", 35, 15000.0);
		Employee1 employee3= new Employee1("ghi", 55, 15000.0);
		Employee1 employee4= new Employee1("jkl", 45, 15000.0);
		Employee1 employee5= new Employee1("pqr", 55, 14000.0);
		Employee1 employee6= new Employee1("mno", 45, 15000.0);
		Employee1 employee7= new Employee1("xyz", 52, 10000.0);
		
		List<Employee1> list = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7);
		
		list.stream().sorted(Comparator.comparing(Employee1::getEmpAge).reversed().thenComparing(Employee1::getEmpSal)).findFirst().ifPresent(System.out::println);
	}
}
