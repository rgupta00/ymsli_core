
public class MyCalculatorApp {

	
	public static void main(String[] args) {
		//MyCalculatorApp 10 20 30
		
		int sum=0;
		sum = sumOfArray(args);
		
		System.out.println(sum);
	}

	private static int sumOfArray(String[] args) {
		
		int sum=0;
		for(int i=0; i<args.length; i++) {
			sum=sum+ Integer.parseInt(args[i]);
		}
		return sum;
	}
	
}
