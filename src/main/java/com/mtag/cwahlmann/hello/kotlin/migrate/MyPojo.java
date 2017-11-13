package com.mtag.cwahlmann.hello.kotlin.migrate;

import java.util.ArrayList;

public class MyPojo extends MyBasePojo {
	private ArrayList<String> values = new ArrayList<String>();
	
	public MyPojo(String value) {
		super(value);
	}
	
	public int getLength() {
		return values.size();
	}
	
	public void add(String value) {
		setValue(value);
		values.add(value);
	}
}
