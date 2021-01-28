package day8_design_pattern.behavioral.str;

interface Sorted {
	public int[] getSortedArray(int arr[]);
}

class BubbleSorter implements Sorted {
	@Override
	public int[] getSortedArray(int[] arr) {
		System.out.println(" Bubble sort logic");
		return null;
	}
}

class MergeSorter implements Sorted {
	@Override
	public int[] getSortedArray(int[] arr) {
		System.out.println("MergeSorter logic");
		return null;
	}
}

class HeapSorter implements Sorted {
	@Override
	public int[] getSortedArray(int[] arr) {
		System.out.println(" heap sort logic");
		return null;
	}
}

class MathLib {
	// bubble sort
	private int[] arr = new int[10];
	private Sorted sorted;

	public void setSorted(Sorted sorted) {
		this.sorted = sorted;
	}

	public MathLib() {
		sorted = new BubbleSorter();
	}

	public int[] getSortedArray() {
		return sorted.getSortedArray(arr);
	}

	public int elementToSearch(int el) {
		return 0;
	}
	//
}

public class DemoMathLib {

	public static void main(String[] args) {

		MathLib lib = new MathLib();
		lib.setSorted(new HeapSorter());
		int arr[] = lib.getSortedArray();

	}

}
