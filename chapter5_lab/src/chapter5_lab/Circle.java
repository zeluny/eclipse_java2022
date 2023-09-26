package chapter5_lab;

public class Circle {
	double radius = 1.0;
	String color = "red";
	
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	void setRadius(double r) {
		this.radius = r;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	void setColor(String c) {
		this.color = c;
	}
	
	String getColor() {
		return this.color;
	}
	
	double getArea() {
		return Math.PI * Math.pow(this.radius,2);
	}
	
	@Override
	public String toString() {
		return ":: Radius ::\nRadius = " + this.radius + "\nColor = " + this.color + "\nArea = " + this.getArea();
	}
}
