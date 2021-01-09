public class Demo4 {
	// java Demo3 1 2 3
	public static void main(String[] args) {
		/*for(String s: args) {
			System.out.println(s);
		}*/
		
	String[][] arguments = new String[2][2];
		int x = 0;
		
		//String temp[][]=new String[2][2];
		// u are assigning the base add of args to the 0th position of 1 d array in arguments
		arguments[0] = args;
		
		
		x = arguments[0].length;
		
		System.out.println(x);
		
		
		for (int y = 0; y <= x; y++) {
			// arguments[0][0], arguments[0][1], arguments[0][2]
			System.out.println(" " + arguments[0][y]);
		}
	}

}