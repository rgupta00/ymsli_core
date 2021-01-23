package com.day7.session1.collection;

import java.util.*;

final class Key {
	private int k;

	public int getK() {
		return k;
	}

	public Key(int k) {
		this.k = k;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Key [k=");
		builder.append(k);
		builder.append("]");
		return builder.toString();
	}

	//hashcode is used to define the bucket
	@Override
	public int hashCode() {
		System.out.println("hashcode is called....");
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}

	//used to compare data with in the buckets
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Eq");
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

}

public class DemoMapWithUserDefineKey {
	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<>();
		Key k = new Key(33);

		map.put(k, "ravi");
//		map.put(new Key(36), "raj");
//		map.put(new Key(35), "kapil");
//		map.put(new Key(55), "sumit");
//		
		
		System.out.println(map.get(k));

	}
}
