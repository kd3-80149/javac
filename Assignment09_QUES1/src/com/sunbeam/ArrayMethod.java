package com.sunbeam;

import java.lang.reflect.Array;

public class ArrayMethod {
  static <T extends Number>T findmin(T[] arr)
{
T min=arr[0];

	for(int i=1;i<arr.length;i++)
	{
		if(min.doubleValue()>arr[i].doubleValue())
			min=arr[i];
	}
	
return min;	
	
}
}

