package project1;

// abstract class cannot be used to create sub classes
abstract public class Employee {

	private int empId;
	private float salary;
	private String n;
	
	//Overloading - same cosntructor, name and return type but different number of arguments
	public Employee(int empId,String n) {
		super();
		this.empId = empId;
		this.salary = 25000;
		this.n = n;
	}
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, float salary, String n) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.n = n;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	
	public abstract float getAllowance(); 
	// cannot define this method for all sub classes at once as values for allowance may vary
	// abstract method - no method body!!!
	// child classes extending this class will mandatorily define this method accordingly
	
	
	public void display() {
		System.out.println("Employee ID:"+ empId);
		System.out.println("Name:"+ n);
		System.out.println("Salary:"+ salary);
		System.out.println("Allowance:"+ getAllowance());
		
	}
	
}
