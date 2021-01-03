
public class DemoSingleton {

	public static void main(String[] args) {
		//static method of a  class can be called without object
		MySingleton m=MySingleton.getMySigleton();
		System.out.println(m.hashCode());
		
		 m=MySingleton.getMySigleton();
		System.out.println(m.hashCode());
		
		
		 m=MySingleton.getMySigleton();
		System.out.println(m.hashCode());
		
		
	}
}
