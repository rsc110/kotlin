package com.rsc.user.bean

class Person constructor(name: String, age: Int) {
	var name = name;

	var age = age
		set(value) {
			var name = this.name;
			if (value > 50) {
				name = name.replace("xiao", "lao");
			}
			this.name = name;
			field = value;
		}

	fun print() {
		println("用户登记，姓名：${name}, 年龄：${age}");
	}
}