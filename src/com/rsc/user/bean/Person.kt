package com.rsc.user.bean

import com.rsc.user.enums.*

open class Person constructor(name: String, age: Int) {
	var gender = GenderEnum.UNKNOW;
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

	constructor (name: String, age: Int, gender: GenderEnum) : this(name, age) {
		this.gender = gender;
	}

	fun print() {
		println("用户登记，姓名：${name}, 年龄：${age}，性别：${gender.showName}");
	}
}