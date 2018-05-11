package com.file.filter;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFilterWriter extends FilterWriter {

	
	protected MyFilterWriter(Writer out) {
		super(out);
	}

	public void write(String str) throws IOException {
		super.write(str.toUpperCase());
	}
}
