package com.mtag.cwahlmann.hello.kotlin;

public class MessageFactory {
	public static String msg() {
		return (int)(Math.random()*100) + " % is crap!";
	}
}
