package com.rsc.test

fun main(args: Array<String>) {
	test1();
	println("----------------------");
	test2();
	println("----------------------");
	test3();
}

fun test1(): Unit {
	var a = 20000;
	println(a);
	println(a.equals(a));
	println(a == a);

	var b = a;
	var c = a;
	println(b.equals(c));
	println(b == c);
	println(b === c);
}

fun test2() {
	var a: Int = 20000;
	println(a);
	println(a.equals(a));
	println(a == a);

	var b: Int = a;
	var c: Int = a;
	println(b.equals(c));
	println(b == c);
	println(b === c);
}


fun test3() {
	var a: Int = 20_000;
	println(a);
	println(a.equals(a));
	println(a == a);

	var b: Int? = a;
	var c: Int? = a;
	println(b?.equals(c));
	println(b == c);
	println(b === c);
}