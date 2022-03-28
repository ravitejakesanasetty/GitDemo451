package com.teja;

import java.util.Scanner;

public class PaperBoySalary {
public static void main(String[] args) {
	int week[]=new int[7];
	Scanner sc=new Scanner(System.in);
			
	for(int i=0;i<7;i++) {
	System.out.println("Enter Paper delivery Shift for "+(i+1)+" day");
	 week[i]=sc.nextInt();
	}
	float salary=0.0f;
	for(int i=0;i<7;i++) {
		salary+=week[i]==0?2:1.5f;
	}
	
	System.out.println("Salary for this week :"+salary);
}
}
