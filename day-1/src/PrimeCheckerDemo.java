import java.util.Scanner;

public class PrimeCheckerDemo {

	public static void main(String[] args) {
		
		int no=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE a no");
		no=scanner.nextInt();
		
		boolean isPrime = primeChecker(no);
	
		if(isPrime)
			System.out.println("it is a prime no");
		else
			System.out.println("not a prime no");
	}

	public static boolean primeChecker(int x) {
		boolean isPrime = true;
		
		for (int i = 2; i < x / 2; i++) {
			if (x%i == 0) {
				isPrime = false;
				break;

			}
		}
		return isPrime;
	}
}
