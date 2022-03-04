package interfaceproject;

public class Rectangle implements Shape{

	private double length;
	private double width;
	public Rectangle(double length, double width) {
		//super(); - since class is calling interface
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length*width;
	}
	
	@Override
	public double getPerimeter() {
		return 2*(length*width);
	}
	
	
}
