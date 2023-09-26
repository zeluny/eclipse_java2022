
public class Square implements RegularPolygon {
	int num;
	public Square() {
		num = 5;
	}
	@Override
	public int getNumsides() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public int getSideLength() {
		// TODO Auto-generated method stub
		return num;
	}
}

