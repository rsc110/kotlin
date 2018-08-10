package com.rsc.test

fun main(args: Array<String>) {
	var nameList = listOf("zhangsan", "lisi", "wangwu");
	for (name in nameList) {
		println("${name}");
		println("${name.replace("zhang", "li")}");
	}
	
	var num = testAddAny(1, 2);
	println(num);
}