package com.day1.session2.fj;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SearchTask extends RecursiveTask<Integer>{
	private static final long serialVersionUID = 1L;

	int arr[];
	int start, end;
	int searchEl;
	
	public SearchTask(int[] arr, int start, int end, int searchEl) {
		this.arr = arr;
		this.start = start;
		this.end = end;
		this.searchEl = searchEl;
	}


	@Override
	protected Integer compute() {
		return processSearch();
	}


	private Integer processSearch() {
		int count=0;
		for(int i=start; i<=end ; i++) {
			if(arr[i]==searchEl) {
				count++;
			}
		}
		return count;
	}
	
}
public class DemoFJ {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,6,7,8,9,10,11,12};
		int serachEl=6;
		int start =0;
		int end=arr.length-1;
		ForkJoinPool forkJoinPool=ForkJoinPool.commonPool();
		SearchTask searchTask=new SearchTask(arr, start, end, serachEl);
		int result =forkJoinPool.invoke(searchTask);
		System.out.println(result);
	}
}








