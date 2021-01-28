package day8_design_pattern.creational.builder;

public class Demo {
	
	public static void main(String[] args) {
		
		Food food=new Food("pg", 100, 300, 400, 5000, 6000, 60000);
		
		Food food2=new FoodBuilder("pg", 100)
				.setVitA(4000)
				.setVitD(40000)
				.setVitB12(3000)
				.getFood();
		System.out.println(food2);
		
		//StringBuilder append = new StringBuilder().append("foo");
		
		//StringBuilder
//		String string=new StringBuilder().append("india").append("is").append("country")
//				.append("of").append("mutiple").append("type").toString();
//		//java 8 stream programming
//		
//		//mokito: fluient api

	}

}
