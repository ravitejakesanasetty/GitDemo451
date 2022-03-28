package com.teja;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {

	public static void main(String[] args) {
		Employee emp=new Employee();
		List<Employee> list=getEmployeeData(emp);
		
		//list.forEach(System.out::println);
		
		List<Employee> collect = list.stream().
				filter(e->e.getEcountry().equals("usa"))
				.sorted((o1,o2)->{
					return o2.getEsal().compareTo(o1.getEsal());
				})
				.collect(Collectors.toList());
		System.err.println("-----------");
	//	collect.forEach(System.out::println);
		Stream<Integer> map = list.stream().filter(e->e.getEsal()>5000).map(e->e.getEsal()).sorted();
		map.forEach(System.out::println);
		System.err.println("-----------");
	  List<String> collect2 = list.stream().filter(e->e.getEsal()>5000).map(e->e.getEcountry()).collect(Collectors.toList());
	  collect2.forEach(System.out::println);
	  System.err.println(collect2.get(0));
	  
	}

	private static List<Employee> getEmployeeData(Employee emp) {
		List<Employee> a=new ArrayList<Employee>();
		a=List.of(new Employee(1,"ravi1","ind",3000),
				new Employee(2,"ravi2","usa",4000),
				new Employee(3,"ravi3","usa",5000),
				new Employee(4,"ravi4","ind",6000),
				new Employee(5,"ravi5","usa",9000),
				new Employee(6,"ravi6","ind",8000)
				);
		return a;
	}
}
