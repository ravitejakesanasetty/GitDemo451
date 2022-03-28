package com.teja;

public class UserDetails {
  private String firstName;
  private String LastName;
  private String email;
  private int type;
  
  
public UserDetails() {
}

public UserDetails(String firstName, String lastName, String email, int type) {
	super();
	this.firstName = firstName;
	LastName = lastName;
	this.email = email;
	this.type = type;
}


@Override
public String toString() {
	return "UserDetails [firstName=" + firstName + ", LastName=" + LastName + ", email=" + email + ", type=" + type
			+ "]";
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
  
  
}
