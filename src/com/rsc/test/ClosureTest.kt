package com.rsc.test

fun main(args: Array<String>) {
	init()
	init1
	init2
}

fun init() {
	{ x: Int, y: Int ->
		println("x + y = ${x + y}")
	}(1, 3)
}

val init1 = {
	println("init1")
}

var init2 = { x: Int, y: Int ->
		println("x + y = ${x + y}")
	}(1, 3)