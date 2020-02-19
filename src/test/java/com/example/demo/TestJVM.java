package com.example.demo;

import java.util.Random;

public class TestJVM {
	public static void main(String[] args) {
		String s = "fgsg";
		
		while (true) {
			s += s + new Random().nextInt(888888888) + new Random().nextInt(999999999);
		}
		
	}
}
