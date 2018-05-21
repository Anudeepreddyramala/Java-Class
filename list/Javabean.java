package com.list;

public class Javabean {
private String Name;
private int ID;

public Javabean(String name,int ID) {
	this.Name = name;
	this.ID=ID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
 

public boolean equals(Object obj) {
	if(obj==null) 
		return false;
	if(!(obj instanceof Javabean)) 
		return false;
	Javabean jb=(Javabean) obj;
	if(Name.equals(jb.Name))
	return true;
	return false;
}

public int hashCode() {
	return Name.hashCode();
}
}
