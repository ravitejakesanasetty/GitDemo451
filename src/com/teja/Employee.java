package com.teja;

public class Employee {
  private Integer id;
  private String ename;
  private String ecountry;
  private Integer esal;
  
public Employee() {
}

public Employee(Integer id, String ename, String ecountry, Integer esal) {
	super();
	this.id = id;
	this.ename = ename;
	this.ecountry = ecountry;
	this.esal = esal;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", ename=" + ename + ", ecountry=" + ecountry + ", esal=" + esal + "]";
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getEcountry() {
	return ecountry;
}

public void setEcountry(String ecountry) {
	this.ecountry = ecountry;
}

public Integer getEsal() {
	return esal;
}

public void setEsal(Integer esal) {
	this.esal = esal;
}
  


  
}
