package com.teja;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetailsForStaffOnly {
 public static void main(String[] args) {
	 UserDetails users=new UserDetails();
	List<UserDetails> list=loadData(users);
	
	
	List<UserDetails> collect = list.stream().
	filter(p->p.getType()==2 ||p.getType()==4).collect(Collectors.toList());
	
	collect.forEach(System.out::println);
	
}

private static List<UserDetails> loadData(UserDetails users) {
	List<UserDetails> a=new ArrayList<UserDetails>();
	
	a=List.of(new UserDetails("ravi1","teja","r1@gmail",1),
			new UserDetails("ravi2","teja2","r2@gmail",2),
			new UserDetails("ravi3","teja3","r3@gmail",3),
			new UserDetails("ravi4","teja4","r4@gmail",4)	);
	return a;
	
}
}

