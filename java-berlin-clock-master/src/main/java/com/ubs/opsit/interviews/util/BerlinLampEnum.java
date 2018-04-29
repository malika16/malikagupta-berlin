package com.ubs.opsit.interviews.util;

public enum BerlinLampEnum {
	YELLOW('Y'), RED('R'), OFF('O');
	private char color;

	private BerlinLampEnum(char color) {
		this.color = color;
	}

	public char getColor() {
		return color;
	}
}
