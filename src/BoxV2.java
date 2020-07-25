
//Creates a Box Class for printing box of stars based on "size" (row and column) input. 
//The Box Class invokes a custom printBox method. 

public class BoxV2 {
	private static int size = 0;
	private static char c;

//Constructor method
	public void Box(int size) {
	}

//Main method
	public static void main(String[] args) {

		BoxV2 Box1 = new BoxV2();
		BoxV2 Box2 = new BoxV2();

		BoxV2.size = 4;
		Box1.printBox();

		Box2.size = 8;
		Box2.printBox(c);
	}

//Establishes the printBox method printing "*"
	public void printBox() {

		for (int l = 0; l < size; l++) {
			for (int w = 0; w < size; w++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

//Establishes the printBox method printing "c"
	public void printBox(char c) {

		for (int l = 0; l < size; l++) {
			for (int w = 0; w < size; w++) {
				System.out.print("c");
			}
			System.out.println();
		}

	}
}
