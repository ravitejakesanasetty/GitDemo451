package com.teja;

public class EvenOrOdd {
public static void main(String[] args) {
	String a[]= {"azbde","abcher","acegk"};
	System.out.println("final result::"+findtheEvenOdd(a));
}

private static String findtheEvenOdd(String[] a) {
	System.out.println(a.length);
	boolean isStringEvenArray[] = new boolean[a.length] ;
    int tempVal;
    boolean isEvenPresent = false;
    for(int i=0; i<a.length;i++){
        isEvenPresent= false;
        for(int j=0; j<a[i].length();j++ ){
            tempVal = (int) a[i].charAt(j);
            if(tempVal%2==0){
                isEvenPresent = true;
            }
            System.out.println(a[i].charAt(j)+"-->"+(int) a[i].charAt(j)+"-->"+isEvenPresent);
        }           
        isStringEvenArray[i] = isEvenPresent; 
        for(int b=0; b<isStringEvenArray.length;b++) {
            System.out.println(a[b]+"-->"+isStringEvenArray[b]);
            }
    }
    
    int oddCount=0;     
    for(int i=0; i<a.length; i++){            
        if(!isStringEvenArray[i])
            oddCount++;         
    }
    System.out.println(oddCount);
    if(oddCount%2!=0)return "odd";
    else return "even";

}

/*
 * private static String findtheEvenOdd(String[] a) { int num=a.length; int
 * oddCount=0; //int finalsum=0; System.out.println("count of string "+num);
 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); int sum=0; for(int
 * j=0;j<a[i].length();j++) {
 * //System.out.println(a[i].charAt(j)+"-->"+(int)a[i].charAt(j)+"-->"+(int)a[i]
 * .charAt(j)*num+"-->"+checkodd((int)a[i].charAt(j)*num));
 * sum=(int)a[i].charAt(j); if(sum%2==0) { System.out.println(sum+"-->even");
 * }else { System.out.println(sum+"-->odd"); oddCount++; }
 * 
 * 
 * }
 * 
 * 
 * //finalsum+=sum; }
 * //System.out.println("odd count:"+oddCount+",finalsum:"+finalsum);
 * if(oddCount%2==0) return "even"; else return "odd"; }
 * 
 * private static String checkodd(int i) { // TODO Auto-generated method stub
 * return i%2==0?"even":"odd"; }
 * 
 * 
 * 
 * 
 */
}