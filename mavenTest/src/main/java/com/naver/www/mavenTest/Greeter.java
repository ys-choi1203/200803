package com.naver.www.mavenTest;

public class Greeter {
	private String format;

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	public String greet(String guest) {
		return String.format(format,guest);
	}
}
