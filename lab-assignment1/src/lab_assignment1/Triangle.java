package lab_assignment1;

public class Triangle {
	private String color;
	private double base;
	private double height;
	
	//Constructor
	public Triangle (String color, double base, double height ) {
		this.color = color;
		this.base = base;
		this.height = height;
	}
	
	//Setter
	public void setColor(String color){
		this.color = color;
	}
	public void setBase(double base){
		this.base = base;
	}
	public void setHeight(double height){
		this.height = height;
	}
	
	//Getter
	public String getColor() {
        return color;
	}
	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
	
	//คำนวณพื้นที่สามเหลี่ยม
	public double calculateArea() {
        return 0.5*base * height;
	}
	
	//แสดงพื้นที่สามเหลี่ยม
	public void getInfo() {
		System.out.println("Triangle area = " + calculateArea());
		System.out.println("color = " + getColor());
		System.out.println("base = " + getBase());
		System.out.println("heighte = " + getHeight());
	}
	
	
}

