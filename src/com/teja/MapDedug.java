package com.teja;

import java.util.HashMap;
import java.util.Map;

public class MapDedug {

	public static void main(String[] args) {
		String s1="FB";
		String s2="Ea";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		Map<String, Integer> map=new HashMap<>();
		map.put(s1, 1);
		map.put(null, 2);
		map.put(s1, 3);
		
	}
}
