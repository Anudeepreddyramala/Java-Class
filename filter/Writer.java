package com.file.filter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) throws IOException{
		File f=new File("C:\\Softwares\\Test.txt");
		FileWriter fw=new FileWriter(f);
		MyFilterWriter mf=new MyFilterWriter(fw); 
		mf.write("I am good");
mf.close();
System.out.println();
	}
}
