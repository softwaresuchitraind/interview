import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
//employees whose age is >25
public class EmpData
{
	public static void main(String[] args)
	{
	       List<Employee> employees = Arrays.asList(
	           new Employee("Alice", 30, "HR"),
	           new Employee("Bob", 24, "IT"),
	           new Employee("Charlie", 28, "Finance"),
	           new Employee("David", 35, "IT"),
	           new Employee("Eve", 22, "HR")
	       );
	       
	       //System.out.println(employees);
	       //employees.stream().filter(x->x.getAge()>25).forEach(System.out::println);
	       List<String> collect = employees.stream()
	       					 .map(x->x.getDepartment().replace("HR", "HR MANAGER")+"--")
	       					 .collect(Collectors.toList());
	       System.out.println(collect);
	       //Consumer<Employee> consumer = (x->System.out.print(x));
	       //System.out.println(consumer);
	       					
	       
	}

}

class Employee {
    private String name;
    private int age;
    private String department;
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
    
    
}

