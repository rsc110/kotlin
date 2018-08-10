package com.rsc.test

fun main(args: Array<String>) {
	var num = 0;
	println(num);
	//val num = 0;
	num = testAdd1(1, 2);
	println(num);

	num = testAdd2(1, 2);
	println(num);

	num = testAdd3(1, 2);
	println(num);

	num = testAddAny(1, 2, 3, 4, 5, 6, 7);
	println(num);

	num = testAddLoop(1, 2);
	println(num);
	num = testAddLoop(1, 7);
	println(num);
	num = testAddLoop(2, 7);
	println(num);
	num = testAddLoopWithoutEnd(2, 7);
	println(num);
}

fun testAdd1(a: Int, b: Int): Int {
	return a + b;
}

val testAdd2: (Int, Int) -> Int = { x, y -> x + y }

fun testAdd3(a: Int, b: Int): Int = a + b

fun testAddAny(vararg numbers: Int): Int {
	var sum = 0;
	for (number in numbers) {
		sum = sum + number;
	}
	return sum;
}

fun testAddLoop(start: Int, end: Int): Int {
	var sum = 0
	// 从start递增到end
	// for(number in start..end step 1){
	// 从end递减到start
	for (number in end downTo start) {
		sum = sum + number;
	}
	return sum;
}

fun testAddLoopWithoutEnd(start: Int, end: Int): Int {
	var sum = 0
	// 从start递增到end，不包含end
	for (number in start until end) {
		sum = sum + number;
	}
	return sum;
}