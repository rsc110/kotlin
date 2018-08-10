package com.rsc.user.bean

class Person2 {
	var name: String = "";
	var age: Int = 0;
	var idCard: String? = null;

	fun print() {
		println("用户登记，姓名：${name}, 年龄：${age}，身份证号：${idCard.toString()}");
	}
}