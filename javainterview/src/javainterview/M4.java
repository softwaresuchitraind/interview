package javainterview;

import java.util.Arrays;
import java.util.List;

/*
 * Write a java 8 program to find employees whose age is greater than 25
 * */
public class M4
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("ABC", 26, "HR");
		Employee employee2 = new Employee("xyz", 29, "SALES");
		Employee employee3 = new Employee("MNO", 24, "HR");
		Employee employee4 = new Employee("PQR", 35, "SALES");
		Employee employee5 = new Employee("JKS", 18, "HR");
		List<Employee> list = Arrays.asList(employee1,employee2,employee3,employee4,employee5);
		//list.stream().filter(x->x.getEmpAge()>25).forEach(System.out::println);
		list.stream().map(x->x.getEmpDept().replace("HR","HRD")).forEach(System.out::println);
	}
}
class Employee
{
	private String empName;
	private Integer empAge;
	private String empDept;
	
	Employee(String empName,Integer empAge,String empDept)
	{
		this.empName = empName;
		this.empAge = empAge;
		this.empDept =empDept;
	}
	
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpName()
	{
		return empName;
	}
	
	public void setEmpAge(Integer empAge)
	{
		this.empAge = empAge;
	}
	public Integer getEmpAge()
	{
		return empAge;
	}
	public void setEmpDept(String empDept)
	{
		this.empDept = empDept;
	}
	public String getEmpDept()
	{
		return empDept;
	}
	
	public String toString()
	{
		return "Employee [ name="+empName+" Age="+empAge+"Dept ="+empDept+"]";
	}
}
