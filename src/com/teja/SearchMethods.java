package com.teja;

import java.util.Arrays;

public class SearchMethods {
public static void main(String[] args) {
	int a[]= {2,4,6,7,8,10,11,1,13,14,5,15,34,65,300,999,210,555};
	for(int b:a) System.out.print(b+" ");
	 linearSearch(a,555);
	 
	 int res[]=bubbleSort(a);
	 System.out.println("bubble sort:");
	 for(int b:res) System.out.print(b+" ");
	 
	 binarySearch(a,555);
	 }

private static int[] bubbleSort(int[] a) {
	 int n=a.length-1;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
			if(a[j]>a[j+1]) {
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	
	return a;
}

private static void binarySearch(int[] a, int find) {
 Arrays.sort(a);
 boolean found=false;
 int totalNumber=a.length-1,i=0;
 while(i<=totalNumber) {
	 int mid=(i+totalNumber)/2;
	 if(a[mid]==find) {
			System.out.println("\nBineary search found the element at position:"+mid);
			found=true;
			break;
		
	 }else if(a[mid]<find) {
		 i=mid+1;
	 }else {
		 totalNumber=mid-1;
	 }
 }
 
 if(!found) {
		System.out.println("\nGiven key is not found");
	}
	
}

private static void linearSearch(int[] a, int find) {
  
  boolean found=false;
	for(int i=0;i<a.length;i++) {
		if(a[i]==find) {
			System.out.println("\nLinear search found the element at position:"+i);
			found=true;
			break;
		}
	}
	
	if(!found) {
		System.out.println("\nGiven key is not found");
	}
}
}
