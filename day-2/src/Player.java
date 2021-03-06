
public class Player {
	private int id;
	private String name;
	private int rank;

	private static int counter = 0;// only one copy per class : class data : static data

	public Player(String name, int rank) {
		this.id = ++counter;
		this.name = name;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void printPlayerDetails() {
		System.out.println("---------------------");
		System.out.println(this);
		System.out.println("id:" + id);
		System.out.println("name" + name);
		System.out.println("rank:" + rank);
		System.out.println("---------------------");
	}

	public static void printPlayerCount() {
		
		System.out.println(counter);
	}
	
}
