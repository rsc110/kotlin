package com.rsc.access.test

import com.rsc.test.*

fun main(args: Array<String>) {
	var num = testAddAny(1, 2);
	println(num);
}

fun testAddAny(a: Int, b: Int): Int {
	println("AccessTest...");
	return a + b;
}