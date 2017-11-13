package com.mtag.cwahlmann.hello.kotlin

// full featured POJO
data class Customer(val name: String, val email: String, val company: String)

// singleton
object Company {
    val name: String = "MT-AG"
}
