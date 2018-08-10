package com.rsc.test

fun main(args: Array<String>) {
	var string = "测试字符串";
	println(string);
	// 替换
	println(string.replace("测试", "Test"));
	// 翻转
	println(string.reversed());
	// 截取
	println(string.substring(0, 1));

	// 模板
	println("我输入的测试字符串是：$string");
	// 模板内调用方法，用花括号包裹
	println("我输入的测试字符串替换后是：${string.replace("测试", "Test")}");

	string = "20";
	var intVal = string.toInt();
	println(intVal == 20);
}