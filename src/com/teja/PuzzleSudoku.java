package com.teja;

public class PuzzleSudoku {
public static void main(String[] args) {
	String data="3275164984..287..5....4......6...5......5....7...3...18.2...9.3.13...84..........";
	String arr[]=new String[81];
	String res[]=new String[81];
	if(data.length()==81) {
		for(int i=0;i<81;i++) {
			arr[i]=data.charAt(i)+"";
		}
		int count=1;
		for(String a:arr) {
			
			System.out.print(a+" ");
			if(count%9==0) System.out.println();
			count++;
			
		}
		
		solvePuzzle(arr);
		boolean resu=filledPuzzle(arr);
		while(!resu) {
			for(int i=0;i<81;i++) {
				arr[i]=data.charAt(i)+"";
			}
			resu=filledPuzzle(arr);
		}
	}
}

private static boolean filledPuzzle(String[] arr) {
	//System.out.println("filling");
    int min=1;
	boolean b=false;
	String res[]=arr;
	for(int i=0;i<81;i++) {
		if(arr[i].equals(".")) {
		int val=randomValue();
         
		res[i]=val+"";
		 min=1;
		 while(!setValues(i,res)) {
			  val=randomValue();
				res[i]=val+"";
				min++;
			//	System.out.println("count:"+min);
				if(min>50) {
					break;
				}
				 
		 }
		 if(min>50) {
				break;
			}
			/*
			 * int count=1; for(String a:res) { System.out.print(a+" "); if(count%9==0)
			 * System.out.println(); count++;
			 * 
			 * }
			 * 
			 */	/*
		 * if(i==20 || i==23 ||i==26 ||i==48 ||i==51||i==54) {
		 * System.out.println("adjustLines checking"); if(!adjustLines(res)) { return
		 * false; } }
		 */ 
		}
		
	}	if(min>50) {
		return false;
	}
	
	System.err.println("final result");
	int count=1;
	 for(String a:res) {
		System.out.print(a+"  ");
		if(count%9==0) System.out.println();
		count++;
		
	}
	
	return true;
	        	  

	
	
	
	
}

private static int randomValue() {
	int min=1,max=9;
	return (int)(Math.random()*(max-min+1)+min);
}

private static boolean setValues(int i, String[] res) {
//	System.err.println("-------------");
          if(verticalLine(i, res) && hortizalLine(i, res) && adjustLines(res)) {
        	  
          }else {
    			return false;
    		}
          
           
        return true;	  
}

private static void solvePuzzle(String[] arr) {
	
	boolean v=true;
	boolean h=true;
	boolean ad=true;
	for(int i=0;i<81;i++) {
		if(!arr[i].equals(".")) {
			if(v) { 
				v=verticalLine(i,arr);
				if(!v) {
					System.out.println("unsolvable vertically");
					break;
				}
			}
			if(v && h) { 
				h=hortizalLine(i,arr);
				if(!h) {
					System.out.println("unsolvable hortizontally");
					break;
				}
			}
	          
		}
	}
	
	if(v && h) {
	ad=adjustLines(arr);
	if(!ad) {
		System.out.println("unsolvable adjusted");
	}
	}
	  
	 
}

private static boolean verticalLine(int i, String[] arr) {
	int c=0;
	int colNum=0;
	for(int v=(i+1);v%9!=0;v++) {
		colNum++;
		  if(arr[i].equals(arr[v])) {
			 c++;
			 break;
		  }
		}
//	System.out.println(colNum);
	if(8-colNum>0 && c==0) {
	for(int v=i-1;8-colNum>0;v--) {
		colNum++;
	//	System.out.println(arr[i]+" "+arr[v]);
		  if(arr[i].equals(arr[v])) {
			 c++;
			 break;
		  }
		}
	}
	return c>0?false:true;
}

private static boolean hortizalLine(int i, String[] arr) {
	int c=0;
	int colNum=0;
	for(int v=(i+9);v<81;v=v+9) {
		colNum++;
		  if(arr[i].equals(arr[v])) {
			 c++;
			 break;
		  }
	}
	
//	System.out.println(colNum);
	if(8-colNum>0 && c==0) {
		for(int v=i-9;8-colNum>0;v=v-9) {
			colNum++;
	//		System.out.println(arr[i]+" "+arr[v]);
			  if(arr[i].equals(arr[v])) {
				 c++;
				 break;
			  }
			}
		
	}
	
	return c>0?false:true;
}

private static boolean adjustLines(String[] arr) {
	int c=0;
    for(int i=0;i<81;i++) {
    	String res="";
    	for(int n=i;n<i+3;n++) {
//    	 	System.out.println(arr[n]+" "+arr[(n+9)]+" "+arr[(n+18)]);
    		res+=arr[n]+arr[n+9]+arr[n+18];
    		c++;
    	}
  //  	System.out.println(c);
  //  	System.out.println(res.replace(".", ""));
  //  	System.out.println(res.replace(".", "").chars().distinct().count());
    	if(res.replace(".", "").chars().distinct().count()!=9) {
    		if(res.replace(".", "").length()!=res.replace(".", "").chars().distinct().count()) {
    		return false;
    		}
    	}
    	if(c%3==0) {
    		if(c%9==0) {
    		i=(c*3)-1;	
    		}else {
    		i+=2;
    		}
    	}
    }

	return true;
}


}