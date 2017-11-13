package com.mtag.cwahlmann.hello.kotlin.migrate;

public class MyBasePojo {
	private String value;
	
	public MyBasePojo(String value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
