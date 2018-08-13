package com.rsc.test

fun main(args: Array<String>) {
	//print(lambdaAdd(1, 2));
	log("hello World!!!", printMsg);
}

val lambdaAdd = { a: Int, b: Int ->
	a + b;
}

val printMsg = { str: String ->
	println(str)
}

val log = { str: String, printLog: (String) -> Unit ->
	printLog(str)
}