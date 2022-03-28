package com.teja;

public class VowelMaxCountHackerTask {
  public static void main(String[] args) {
	String s="asdashtaioa";
	int k=3;
	String result=vowelSubstring(s,k);
}

private static String vowelSubstring(String s, int k) {
	int count;
	int max=0;
	String[] su=new String[s.length()/k];
	Integer[] countresult=new Integer[s.length()/k];
	System.out.println("no. of recursion"+s.length()/k);
	for(int i=0;i<s.length();i=k+i) {
		count=0;
		su[max]=s.substring(i, k+i).toString();
	//	System.out.println(su[max]);
		
		if(su[max].toString().contains("a")) count++;
		if(su[max].toString().contains("e")) count++;
		if(su[max].toString().contains("i")) count++;
		if(su[max].toString().contains("0")) count++;
		if(su[max].toString().contains("u")) count++;
		
		//System.out.println(su[max]+":"+count);
		countresult[max]=count;
		max++;
	}
  for(int i=0;i<su.length;i++) {
	  System.out.println("new:-"+su[i]+",count:"+countresult[i]);
  }
	return null;
}
}
