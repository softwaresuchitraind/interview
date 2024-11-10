package javainterview;

import java.util.Arrays;
import java.util.List;

//Sort person based on their age in decending order
class Person
{
	int id;
	String name;
	int age;
	public Person(int id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
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
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
public class M10
{
	public static void main(String[] args)
	{
		List<Person> list = Arrays.asList(new Person(1,"AAA",29),new Person(2,"BBB",18),new Person(3,"CCC",48));
		list.stream().sorted((e1,e2)->e2.getAge()-e1.getAge()).forEach(System.out::println);
	}
}
