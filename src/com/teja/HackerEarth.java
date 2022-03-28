package com.teja;

public class HackerEarth {
   int val=10;
   public static void main(String[] args) {
	HackerEarth h=new HackerEarth();
	System.out.println(h.val);
	StaticClass s=new StaticClass()
			;
	s.display();
}
}

 class StaticClass{
	final int num=10;
	public void display() {
		int num=15;
		Runnable r=new  Runnable() {
			final  int num=20;

			@Override
			public void run() {
				int num=2;
				
				System.out.println(num);
			}
		};
		r.run();
	}
}