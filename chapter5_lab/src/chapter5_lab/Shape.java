package chapter5_lab;

class Shape {
	public void pShape() {
		System.out.println("This is Shape");
	}
}

class Rectangle extends Shape{
	public void pRectangle() {
		System.out.println("This is rectangular shape");
	}
}

class Circles extends Shape{
	public void pCircle() {
		System.out.println("This is circular shape");
	}
}

class Square extends Rectangle{
	public void pSquare() {
		System.out.println("Square is a rectangle");
	}
}

class Output3{
	public static void main(String[] args){
		Square sq = new Square();
		sq.pShape();
		sq.pSquare();
		sq.pRectangle();
	}
}
