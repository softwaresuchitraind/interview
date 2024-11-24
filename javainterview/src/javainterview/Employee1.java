package javainterview;

public class Employee1
{
	private String empName;
	private Integer empAge;
	private Double empSal;
	public Employee1(String empName, Integer empAge, Double empSal)
	{
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSal = empSal;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public Integer getEmpAge()
	{
		return empAge;
	}
	public void setEmpAge(Integer empAge)
	{
		this.empAge = empAge;
	}
	public Double getEmpSal()
	{
		return empSal;
	}
	public void setEmpSal(Double empSal)
	{
		this.empSal = empSal;
	}
	@Override
	public String toString()
	{
		return "Employee1 [empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal + "]";
	}
	
	
}
