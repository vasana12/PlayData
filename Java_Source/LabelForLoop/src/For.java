import static java.lang.System.out;

public class For {

	public static void main(String[] args) {
		
outerLoop:
		for(int row = 0; row <3; row ++) {
			for(int col = 0; col <5; col ++) {
				if(row == 1 && col ==4) {
					break outerLoop;
				}
				out.println("(" + row + "," + col + ")");
			}
		}

	}

}
