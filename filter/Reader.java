package com.file.filter;

import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String args[]) throws IOException {
		FileReader fr=new FileReader("C:\\Softwares\\Test.txt");
		MyFilterReader mf=new MyFilterReader(fr);
		
		int i;
		while((i=mf.read())!=-1) {
			System.out.print((char)i);
		}
		mf.close();
	}
}
