package com.sunjiamin.demo;

public class HelloworldService {

	private String words;

	private String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String sayHello() {
		return "hello, " + words;
	}
}
