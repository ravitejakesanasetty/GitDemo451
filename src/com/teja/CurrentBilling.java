package com.teja;

import java.util.Scanner;

public class CurrentBilling {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Starting unit");
	float a=sc.nextFloat();
	System.out.print("Enter Ending unit");
	float b=sc.nextFloat();
	float unit=b-a;
	float current=0.0f;
	if(unit<100) {
		current=(float) (unit*2.5);
	}else if(unit>=100 && unit<200) {
		current=(float) (unit*3.5);
	}else if(unit>=200 && unit<500) {
		current=(float) (unit*4.5);
	}
	
	System.out.println("Your Current Bill :"+current);
}
}
