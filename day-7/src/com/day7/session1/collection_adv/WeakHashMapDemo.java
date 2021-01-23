package com.day7.session1.collection_adv;

import java.util.*;

class Key {
	private int k;

	public int getK() {
		return k;
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

	public void setK(int k) {
		this.k = k;
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
}

public class WeakHashMapDemo {

	public static void main(String[] args) {
		//Normal hashmap vs weakhashmap
		
		WeakHashMap<Key, Integer> map=new WeakHashMap<>(); //normal map : strong ref
		
		Key key=new Key(44);//strong ref
		
		map.put(key, 44);
		
		key=null;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		System.gc();
		
		System.out.println(map);
		
	}
}





