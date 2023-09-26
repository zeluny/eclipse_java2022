
class Exercise2 extends Exception { }

	class Main {
		public static void main(String args[ ]) {
			try {

				throw new Exercise2 ( ) ;
			}
			catch (Exercise2 t) {
				System . out . println( "Got the Test Exception") ;
			}
			finally {
				System . out . println( "Inside finally block ");
			}
		}
	}