package com.teja;

public class SpiralArray {

	 public static void main(String[] args) {
            int r=3,c=3;		 
			int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
			spiral(r,c,a);
	 }

	private static void spiral(int r, int c, int[][] a) {
         for(int i=0;i<r;i++) {
    		   System.out.print(a[0][i]+" ");
    	   }
         for(int i=1;i<c;i++) {
        	  System.out.print(a[i][r-1]+" ");
         }
         
         for(int i=c-2;i>=0;i--) {
       	  System.out.print(a[c-1][i]+" ");
        }
         for(int i=r-2;i>0;i--) {
          	  System.out.print(a[i][0]+" ");
           }
	}
}
