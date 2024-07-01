package com.sukla.inter5;

import java.util.Date;

public class Employee
{
	String empId;
	int age;
	double empSal;
	
	
	public Employee(String empId, int age, double empSal)
	{
		super();
		this.empId = empId;
		this.age = age;
		this.empSal = empSal;
	}
	public String getEmpId()
	{
		return empId;
	}
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public double getEmpSal()
	{
		return empSal;
	}
	public void setEmpSal(double empSal)
	{
		this.empSal = empSal;
	}
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", age=" + age + ", empSal=" + empSal + "]";
	}
	
	
	
	
}
