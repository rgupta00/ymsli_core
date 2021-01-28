package day8_design_pattern.behavioral.iter;

import java.util.*;

class Item {
	String name;
	float price;

	public Item(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return name + ": $" + price;
	}
}

//
//class ItemStoreV2 {
//	private Item[]items;
//
//	public ItemStoreV2() {
//		items=new Item[10];
//	}
//	public void addItem(Item item) {
//		
//	}
//	public Item[] getItem(){
//		return items;
//	}
//}
/*
 * how to implements iterator dp 1. make class imp... Iteratable 2. make a inner
 * class inside that class that imp... iterator
 * 
 */
class ItemStore implements Iterable<Item> {
	private List<Item> items;

	public ItemStore() {
		items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public Iterator<Item> iterator() {
		return new ItemIterator();
	}

	class ItemIterator implements Iterator<Item> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= items.size()) {
				return false;
			} else
				return true;
		}

		@Override
		public Item next() {
			return items.get(currentIndex++);
		}

		@Override
		public void remove() {
			items.remove(--currentIndex);
		}
	}
}

public class DemoIter {

	public static void main(String[] args) {

		ItemStore itemSt = new ItemStore();
		itemSt.addItem(new Item("TV", 50));
		itemSt.addItem(new Item("mouse", 5));

		Iterator<Item> it=itemSt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

		// Iterator vs Iterable
//		List<Integer> list=new ArrayList<>();
//
//		list.add(55);
//		list.add(57);
//		list.add(565);
//		list.add(85);
//		
//		Iterator<Integer> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
	}
}
