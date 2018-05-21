package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_and_Arraylist {
	

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("Anudeep");
		l.add("Reddy");
		l.add("Ramala");
		l.add("I");
		l.add("am");
		l.add("Good");
		List<String> sl=l.subList(1, 4);
System.out.println("List : "+ l +"\n"+ "Sublist : "+ sl);

String[] array=new String[l.size()];
for(int i=0;i<l.size();i++) {
	array[i]=l.get(i);
	System.out.println("Array Elements : "+array[i]);
}
/*for(String array: l) {
	System.out.println("Array Elements: " +array);
}*/


List<String> l1=Arrays.asList(array);
	System.out.println("List : "+l1);	
	
Javabean j1=new Javabean("Anudeep",123);
Javabean j2=new Javabean("Anudeep",123);

List<Javabean> list=new ArrayList<Javabean>();
list.add(j1);
list.add(j2);

System.out.println(j1.equals(j2));
System.out.println(j1.hashCode()+" "+j2.hashCode());
	}
}
