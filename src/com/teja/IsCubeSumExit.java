package com.teja;

public class IsCubeSumExit {
public static void main(String[] args) {
	int a[]= {35,9,1};
	int n=3;
	int s=findGoodInteger(a,n);
	System.out.println("Number of Good integer:"+s);
}

private static int findGoodInteger(int[] a, int n) {
	int cout=0;
	
	for(int c=0;c<n;c++) {
		for(int i=1;i<=a[c];i++) {
			for(int j=1;j<=i;j++) {
				if(Math.pow(i, 3)+Math.pow(j, 3)==a[c]) {
					cout++;
				}
			}
		}
	}
	
	return cout;
}
}
