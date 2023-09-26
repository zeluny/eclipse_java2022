package chapter5_sec2_shape;

public abstract class Shape {
	
	String color;
	
	public Shape() {
		color = "Black";
	}
	
	void setColor(String c) {
		color = c;
	}
	String getColor() {
		return color;
	}
	
	abstract float calculateArea();
}
