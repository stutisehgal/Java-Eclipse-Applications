package interfaceproject;

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4);
		showData(r);
		//showData method calls rectangle object methods here
		
		Square sq = new Square(4);
		showData(sq);
		//showData method calls square object methods here
	}
	
	static void showData(Shape s) {
		
		if(s instanceof Rectangle) {
			System.out.println("Rectangle Details:");
		}
		// instanceof method is capable of telling if the Shape object s has data of which class
		
		if(s instanceof Square) {
			System.out.println("Square Details:");
		}
		
		System.out.println("Area: "+s.getArea());
		System.out.println("Perimeter: "+s.getPerimeter());
		}
}
