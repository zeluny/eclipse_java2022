
public class ex4 {
	static void f(int a) {
		try {
			if(a < 0) {
				throw new Exception();
			}else {
				g(a);
				System.out.println("ข้อมูถูกต้อง ข้อมูลต้องมากกว่า 0");
			}
			
		} catch(Exception fe) {
			System.out.println("ผิดพลาด a ห้ามน้อยกว่า 0");
			//fe.printStackTrace();
		}
	} //F()
	
	static void g(int a)  {
		try {
			if(a > 10) {
				throw new Exception();
			}else {
				System.out.println("ข้อมูถูกต้อง ข้อมูลต้องห้ามมากกว่า 10");
			}
			
		} catch(Exception ge) {
			System.out.println("ผิดพลาด a ห้ามมากกว่า 10");
			//ge.printStackTrace();
		}
	}//G()
	
	public static void main(String[] args) {
		f(-1);
		System.out.println("-----");
		f(10);
		System.out.println("-----");
		f(11);
	}//F()
}
