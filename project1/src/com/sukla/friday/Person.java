package com.sukla.friday;

import java.io.Serializable;

public class Person implements Serializable
{
	private String personId;
	private String personName;
	private Integer age;
	
	public Person()
	{
		
	}
	public Person(String personId, String personName, Integer age)
	{
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
	}
	public String getPersonId()
	{
		return personId;
	}
	public void setPersonId(String personId)
	{
		this.personId = personId;
	}
	public String getPersonName()
	{
		return personName;
	}
	public void setPersonName(String personName)
	{
		this.personName = personName;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
	}
	
	

}
