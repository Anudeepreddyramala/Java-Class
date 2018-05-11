package com.file.filter;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class MyFilterReader extends FilterReader {

	protected MyFilterReader(Reader in) {
		super(in);
	}
	
	public int read() throws IOException {
		int x=super.read();
		if((char)x==' ') {
			return ((int)'?');
		}
		else
		return x;
		
	}

}
