package com.example.demo.initialize;


public class Something {
	public static void main(String[] args) {
		Other o = new Other();
		new Something().addOne(o);
	}

	public void addOne(final Other o) {
		//o = new Other();	final的，不可new对象来改变
		o.i++;
		System.out.println(o.i);
	}
}

class Other {
	public int i;
}

