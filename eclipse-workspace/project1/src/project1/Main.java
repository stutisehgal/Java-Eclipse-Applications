//if packages from which classes are being called are different then - import packagename.Class;

package project1;

public class Main {
	public static void main(String[] args) {
		Student s1; //declaring a reference variable in main class to another class object
		
		s1=new Student(100,"Falgun",78.5f); //setting dynamic data to object of Student class
		System.out.println(s1);
		
		//OVRLOADING CONSTRUCTORS OF EMPLOYEE CLASS - 
		//Employee e1=new Employee(121,"Prateek");
		//Employee e2=new Employee();
		//Employee e3=new Employee(121,700000.0f,"Prateek");
		//e1.display();
		
		// cannot create object of abstract class 
		
		Employee e; // polymorphism - we can assign object of super class to any/all subclass
		
		//Director d=new Director(200,340000,"Dharam","Microsoft");
		//d.display();
		
		e=new Manager(100,34000,"Manish","HDFC Bank");
		e.display();
		
		e=new Director(200,340000,"Dharam","Microsoft");
		e.display();
	}
}
