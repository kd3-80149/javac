//8. Create an IntStream to represent numbers from 1 to 10. Call various functions like sum(), summaryStatistics() and observe the output.
package com.sunbeam;

import java.util.stream.IntStream;

public class IntStreamMain {

	public static void main(String[] args) {
		IntStream s= IntStream.range(1, 10);
		int sum=s.sum();
		System.out.println(sum);
		IntStream s1=IntStream.range(1, 10);//1 include and 10 exclude
		System.out.println(s1.summaryStatistics());

	}

}
