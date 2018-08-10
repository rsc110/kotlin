package com.rsc.test

import java.lang.StringBuilder

fun main(args: Array<String>) {
	var a: Any = 1;
	var printText = StringBuilder("");
	when (a) {
		is Int -> printText.append("这是一个数字")
		in 0..10 -> printText.append("这个数字是0到10中间的数")
		!is String -> printText.append("这不是一个字符串")
		else -> printText.append("不符合条件")
	}

	var printText2 =
					when (a) {
						is Int -> "这是一个数字"
						in 0..10 -> "这个数字是0到10中间的数"
						!is String -> "这不是一个字符串"
						else -> "不符合条件"
					}


	println(printText);
	println(printText2);
}