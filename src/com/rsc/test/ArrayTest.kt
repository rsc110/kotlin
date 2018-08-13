package com.rsc.test

class ArrayTest<in A> {
	fun getVal(a: A): Int? {
		return a?.hashCode();
	}

//	fun getA(a: A): A? {
//		return a;
//	}
}