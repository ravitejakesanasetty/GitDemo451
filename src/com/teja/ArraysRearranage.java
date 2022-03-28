package com.teja;

import java.util.Arrays;

public class ArraysRearranage {
public static void main(String[] args) {
	int arr[]= {9,1,2,5,4,6,7,0,8,33,22,57,99};
	Arrays.sort(arr);
	int res[]=new int[arr.length];
	int evenPosition=0;
	int oddPosition=Math.round(arr.length/2);
	  for(int j:arr) {
		  System.out.print(j+" ");
	  }
	  System.out.println("\n----------");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			res[evenPosition]=arr[i];
			evenPosition++;
		}else {
			res[oddPosition]=arr[i];
			oddPosition++;
		}
		}
	 for(int j:res) {
		  System.out.print(j+" ");
	  }
	
}

}
