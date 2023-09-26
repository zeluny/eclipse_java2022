package chapter5_sec2_shape;

public class Rectangle extends Shape {
	
	float width;
	float height;
	
	public Rectangle(float w,float h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	float calculateArea() {
		return this.width * this.height;
	}
	
	void setWidth(float w) {
		this.width = w;
	}
	float getWidth() {
		return this.width;
	}
	void setHeight(float h) {
		this.height = h;
	}
	float getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {
		return ":: Rectangle ::\n" +
				"Width = " + this.getWidth() + "\n" +
				"Height = " + this.getHeight() + "\n" +
				"Color = " + getColor() + "\n" +
				"Area = " + this.calculateArea();
	}
}
