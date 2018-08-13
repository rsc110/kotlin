package com.rsc.user.enums

/*
 * 用户性别枚举类
 */
enum class GenderEnum() {
	UNKNOW("未知"), MALE("男"), FEMALE("女");

	var showName = "";

	constructor(showName: String) : this() {
		this.showName = showName;
	}
}