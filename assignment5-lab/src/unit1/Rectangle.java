package unit1;
public class Rectangle implements Printable {
	//Attributes
	float width;
	float height;
	
	public Rectangle (float w, float h) {
		this.width = w;
		this.height= h;
	}
	public void print() {
		System.out.println("Rectangle width: "+width+" height: "+height+" Area: "+width*height);
	}
}

