
class Dog{
	String dogName;
	
	Dog(String dogName){
		this.dogName=dogName;
	}
	public void printName() {
		System.out.println(this.dogName);
	}
}

public class DemoArray {
	
	public static void main(String[] args) {
		
		Dog [] dogs= {new Dog("stonish"),new Dog("foo"),new Dog("bar"),new Dog("zar")};
		
		
		for(Dog dog: dogs) {
			dog.printName();
		}
		
		
		
		
		//int x[]= {4,5,6,7};
		
		//enhace for loop
		
//		for(int n: x)
//			System.out.println(n);
		
		//print  ctrl /
		
	/*  for(int i=0; i<=x.length; i++ ) {
			System.out.println(x[i]);
		}*/
		
		
		
		
	}

}
