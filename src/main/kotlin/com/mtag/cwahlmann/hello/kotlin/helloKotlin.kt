package com.mtag.cwahlmann.hello.kotlin

fun main(args: Array<String>) {
	var x = 1;
	val y = x + 1;
	var z = x.inv()
	
	println ("x=" + x + ", y=" + y + ", z=" + z)
	println (hello())
	println (sum1(1,5))
	println (sum2(1,5))
}

fun hello() = "Hello Kotlin du Ei! " + MessageFactory.msg()

fun sum1(a:Int, b:Int) = a + b

fun sum2(a:Int, b:Int) = "sum of $a and $b is ${a + b}"

