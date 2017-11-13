package com.mtag.cwahlmann.hello.kotlin.migrate

fun main(args: Array<String>) {
	val myPojo = MyKotlinPojo("pojo!!")
	myPojo.add("dojo!!")
	println( myPojo.value )
	println( myPojo.length() )
	println( myPojo.values.first() )
	
	val myBaseKotlinPojo = MyBaseKotlinPojo("kotlin pojo!!")
	println( myBaseKotlinPojo.value)
}

