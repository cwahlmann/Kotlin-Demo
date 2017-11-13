package com.mtag.cwahlmann.hello.kotlin.migrate;

import java.util.ArrayList;

class MyKotlinPojo(value: String): MyBasePojo(value) {
	val values = ArrayList<String>()
	
	fun length() = values.size
	
	fun add(value: String) {
		setValue(value)
		values.add(value)
	}
}
