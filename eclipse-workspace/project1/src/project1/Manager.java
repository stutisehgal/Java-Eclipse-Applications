//if packages are different then - import packagename.Class;

// INHERTITANCE - create a class extending already existing class
// Note - subclass inherits everything in super class except construct and private variables, methods
// if any inherited method is not suitable in sublcass, we need to override it
//Override - by creating method with same return type, name and arguments in subclass
//*Subclass constructor must call super class constructor using 'super'
package project1;

public class Manager extends Employee{
	private String project;

	public Manager(int empId, float salary, String n, String project) {
		super(empId, salary, n);
		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	// display method in Manager overrides display method inherited from Employee super class
	public void display() {
		//System.out.println("Employee ID:"+ getEmpId());
		//System.out.println("Name:"+ getN());
		//System.out.println("Salary:"+ getSalary());
		//System.out.println("Allowance:"+ getAllowance());
		
		super.display();
		System.out.println("Project:"+ project);
		
	}

	@Override
	public float getAllowance() {
		return getSalary()*0.1f;
	}
}
