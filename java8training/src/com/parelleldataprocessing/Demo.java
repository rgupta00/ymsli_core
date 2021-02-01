package com.parelleldataprocessing;

import java.util.LongSummaryStatistics;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class Demo {

	public static void main(String[] args) {
		//Accumunation vs reduction
		
		//sum is a array of size one and init with zero
//		final long []sum=new long[] {0};//why array?
//		//If u want to appy || stream never ever use accumulation operation:
//		
//		LongStream.rangeClosed(0, 1_000_000).parallel().forEach( i->  sum[0]+=i);
//		
//		System.out.println(sum[0]);
		
		
		//accumulation
		
		LongSummaryStatistics summaryStatistics = LongStream.rangeClosed(0, 1_000_000)
				.parallel()
				.summaryStatistics();
		System.out.println(summaryStatistics.getMax());
		
//		long sum=0;
//		for(long i=0;i<=1_000_000;i++){
//			sum=sum+i;
//		}
//		System.out.println(sum); //500000500000
	}
}
