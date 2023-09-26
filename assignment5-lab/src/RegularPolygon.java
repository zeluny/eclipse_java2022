
public interface RegularPolygon {
	public abstract int getNumsides();
	public abstract int getSideLength();
	public static double getTotalsides() {
		EquilateralTriangle c1 = new EquilateralTriangle();
		Square c2 = new Square();
		return c1.getNumsides()+c2.getNumsides();
	}
	default int getperimeter(int n,int length) {
		return n*length;
	}
	default double getInteriorAngle(int n) {
		return (n-2)*3.14;
	}
}
