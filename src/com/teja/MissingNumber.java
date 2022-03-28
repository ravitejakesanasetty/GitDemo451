package com.teja;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//how to find the mssing number from list ->1,2,4,5,0 they are not duplicate and natural number
public class MissingNumber {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,4,5,0,9);
		
		List<Integer> b=a.stream().sorted().collect(Collectors.toList());
		int n=b.size();
		int k=0;
		int finalValue=b.get(b.size()-1);
		System.out.print("Missing number:");
		while(k!=finalValue) {
			if(k!=b.get(k)) {
				System.out.print(k+" ");
				b.add(k);
				b=b.stream().sorted().collect(Collectors.toList());
			}
			k++;
		}
		
		
		
	}
}
