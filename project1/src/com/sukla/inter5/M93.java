import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee1 {
    String id;
    int age;
    double salary;

    public Employee1(String id, int age, double salary) {
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class M93 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee1("1", 25, 1500.0),
            new Employee1("2", 26, 2500.0),
            new Employee1("3", 18, 500.0),
            new Employee1("4", 18, 400.0),
            new Employee1("5", 30, 14500.0),
            new Employee1("6", 30, 15500.0)
        );

        Employee result = employees.stream()
            .sorted(Comparator.comparing(Employee::getAge).reversed()
                .thenComparing(Employee::getSalary))
            .findFirst()
            .orElse(null);

        System.out.println(result);
    }
}
