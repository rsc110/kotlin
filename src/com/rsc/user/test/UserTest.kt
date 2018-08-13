package com.rsc.user.test

import com.rsc.user.bean.*
import com.rsc.user.enums.*
import com.rsc.java.test.PrintBean

fun main(args: Array<String>) {
	//testPerson();
	testChild();
	//testPerson2();
	//testJava();
}

fun testJava() {
	//	调用java类
	var printBean = PrintBean();
	printBean.name = "laoli";
	printBean.age = 22;
	printBean.print();
}

fun testChild() {
	var person = Child("xiaozhang", 20, GenderEnum.MALE);
	person.print();
	println("过了40年。。。");
	person.newPrint();
	(person as Person).newPrint();
}

fun testPerson() {
	var person = Person("xiaozhang", 20);
	person.gender = GenderEnum.MALE;
	person.print();
	println("过了40年。。。");

	person.age = 60;
	person.gender = GenderEnum.FEMALE;
	person.print();
	// 扩展函数
	person.newPrint();
	person.print();
}

fun testPerson2() {
	var person = Person2();
	person.name = "xiaozhang";
	person.age = 20;
	person.idCard = "ID123456";
	person.print();
	println("过了40年。。。");

	person.name = "laozhang";
	person.age = 60;
	person.print();
}

fun Person.newPrint(age: Int = 50) {
	this.age = age;
	println("${this.name}今年${this.age}岁，性别${this.gender.showName}");
}

fun Child.newPrint(age: Int = 50) {
	this.age = age;
	println("child：${this.name}今年${this.age}岁，性别${this.gender.showName}");
}