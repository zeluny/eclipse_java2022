
public class EquilateralTriangle implements RegularPolygon {
	
	int num;
    public EquilateralTriangle() {
    	num = 2;
    }
    
    @Override
	public int getNumsides() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public int getSideLength() {
		// TODO Auto-generated method stub
		return num;
	}

}
