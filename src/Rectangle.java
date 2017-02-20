
public class Rectangle {
	private double a;
	private double b;

	public double area() {
		double area = a * b;
		return area;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double perimeter() {
		double perimeter = a * 2 + b * 2;
		return perimeter;
	}

}
