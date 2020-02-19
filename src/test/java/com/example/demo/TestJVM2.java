package com.example.demo;


public class TestJVM2 {
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		
		System.out.println("a:" + a + " ,b:" + b + " "+(a - b));
		
		int c = 2147483647;
		int d = 1;
		System.out.println(c + d);
	}
}
