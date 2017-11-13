package com.mtag.cwahlmann.hello.kotlin

fun main(args: Array<String>) {

	// not nullable Type
	//	var output: String

	// nullable type
	var output: String? = null

	output = null   // not nullable? then compilation error


	// not nullable Type
	//	val name: String
	val name: String = "hey"

	// not nullable Type
	//	val name: String? = null

	println(name.length)      // nullable or not initialized? -> compilation error
}


// compiler automated class casts

class Invoice {
	fun calculateTotal() {}
}

fun calculateTotal(obj: Any) {
	if (obj is Invoice)
		// let the compiler do the class cast!
		obj.calculateTotal()
}
		