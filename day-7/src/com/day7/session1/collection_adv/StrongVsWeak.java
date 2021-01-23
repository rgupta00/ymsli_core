package com.day7.session1.collection_adv;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class StrongVsWeak {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		//SoftReference vs WeakRef
		/*
		 * Weakref object is wrapping a normal object
		 * ----------------------------------------
		 * if that normal object get nullify
		 * then if gc run then it will see that there is a WR refered to that object that become
		 * null and remove that object
		 * 
		 * SoftRef(it is more stronger)
		 * 
		 *  * if that normal object get nullify
		 * then if gc run then it will see that there is a SR refered to that object that become
		 *then it will not nulify it , only nullify iff u have serious memory shortage
		 *
		 * 
		 */
		
		SoftReference<StringBuilder> weakBuilder = new SoftReference<StringBuilder>(builder);
		builder=null;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		System.gc();
		System.out.println(weakBuilder.get().toString());
	}
	
}
