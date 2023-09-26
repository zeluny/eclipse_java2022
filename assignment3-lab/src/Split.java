
public class Split {
	public static void main(String args[]){
        String str = "Object-Oriented Programming";
        String[] ss = str.split("");
        for( String charecter : ss ) {
            System.out.print( charecter+" ");
        }
    }
}
