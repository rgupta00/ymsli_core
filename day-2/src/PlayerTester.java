
public class PlayerTester {

	public static void main(String[] args) {
		Player player1=new Player("sachin", 2);
		Player player2=new Player("ganguly", 3);
		Player player3=new Player("rahul", 1);
		player1.printPlayerDetails();
		player2.printPlayerDetails();
		player3.printPlayerDetails();
		
		//static method printPlayerCount() from the type Player should be accessed in a static way
		//hey anil it is not your white board it belong to all
		
		Player.printPlayerCount();
	
	}
}
