package com.sukla.tue;

public class Employee
{
	String id;
	String name;
	double salary;
	int age;
	 public Employee()
	{
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, double salary, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	 
	

}
