package com.rsc.java.test;

import com.rsc.test.NumberAddTestKt;
import com.rsc.user.bean.Person;

public class JavaTest {
	public static void main(String[] args) {
		Person person = new Person("老李", 20);
		person.print();
		System.out.println(NumberAddTestKt.testAddLoop(1, 8));
	}
}
