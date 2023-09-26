
public class Run {
	public static void main(String[] args) {
		EquilateralTriangle c1 = new EquilateralTriangle();
		Square c2 = new Square();
		System.out.println("Total: "+RegularPolygon.getTotalsides());
		System.out.println("getPerimeter EquilateralTriangle "+c1.getperimeter(c1.getNumsides(),c1.getSideLength()));
		System.out.println("getPerimeter EquilateralTriangle "+c1.getInteriorAngle(c1.getNumsides()));
		System.out.println("getPerimeter Square "+c2.getperimeter(c2.getNumsides(),c2.getSideLength()));
		System.out.println("getPerimeter Square "+c2.getInteriorAngle(c2.getNumsides()));
	}
}

