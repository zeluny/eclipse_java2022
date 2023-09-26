package chapter5_lab;

public  class Cylinder extends Circle {

	double height = 1.0;
	
	public Cylinder(double r, String c, double h) {
		super(r, c);
		this.height = h;
	}
	
	void setHeight(double h) {
		this.height = h;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getVolumn() {
		return Math.PI * super.getArea() * this.height;
	}
	
	@Override
	public String toString() {
		return ":: Cylinder ::\nRadius = " + super.getRadius() + "\nHeight= " 
	+ this.getHeight()+ "\nColor = " + super.color + "\nArea = " + this.getVolumn();
		
	}

}
