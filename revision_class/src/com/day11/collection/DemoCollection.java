package com.day11.collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
class Key implements Comparable<Key>{
	private int k;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public Key(int k) {
		this.k = k;
	}

	public Key() {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Key [k=");
		builder.append(k);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (k != other.k)
			return false;
		return true;
	}

	@Override
	public int compareTo(Key o) {
		return Integer.compare(this.getK(), o.getK());
	}
	
}
public class DemoCollection {
	
	public static void main(String[] args) {
		Map<Key, String> map=new TreeMap<>();
		map.put(new Key(33), "33");
		map.put(new Key(93), "93");
		map.put(new Key(83), "83");
	
		//how to iterate map
		
		//keySet
		
		//entrySet
		
		Set<Entry<Key, String>> entrySet = map.entrySet();
		for(Entry<Key, String> entry: entrySet) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
	}

}







