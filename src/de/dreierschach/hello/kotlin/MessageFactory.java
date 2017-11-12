package de.dreierschach.hello.kotlin;

public class MessageFactory {
	public static String msg() {
		return (int)(Math.random()*100) + " % is crap!";
	}
}
