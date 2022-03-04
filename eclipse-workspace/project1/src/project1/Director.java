package project1;

public class Director extends Employee{
	private String project;
	private String account;

	public Director(int empId, float salary, String n, String account) {
		super(empId, salary, n);
		this.account = account;
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
		System.out.println("Project:"+ account);
		
	}

	@Override
	public float getAllowance() {
		return getSalary()*0.2f;
	}

}
