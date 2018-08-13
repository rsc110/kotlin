package com.rsc.test

import kotlin.reflect.KType
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt

fun main(args: Array<String>) {
	println(getPassword);
	println(getPassword2());
}

val a = arrayOf("1", "2", "3", "4", "5", "6");
val array = arrayOf(2, 5, 3, 6, 2, 5, 8, 7, 0);
val getPassword = array
				.filter { it in 0 until a.size }
				.map { a[it] }
				.reduce { s1, s2 -> "$s1$s2" };


fun getPassword2(): String {
	var map = mutableListOf("");
	for (ax in 0 until array.size) {
		var x = array[ax];
		if (x >= 0 && x < a.size) {
			map.add(a[x]);
		}
	}
	var iter = map.iterator();
	var password = "";
	while (iter.hasNext()) {
		password = password + iter.next();
	}
	return password;
}