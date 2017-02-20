
public class Circle {

	private double radius;
	private final double PI = 3.14;
	
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double diameter() {
		double diameter = radius * radius;
		return diameter;
	}

	public double area() {
		double area = radius * radius * PI;
		return area;
	}

	public double perimeter() {
		double perimeter = 2 * PI * radius;
		return perimeter;
	}

}
