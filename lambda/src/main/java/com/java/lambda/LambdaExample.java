package com.java.lambda;

interface A {
	void show();
}

class Xyz implements A {

	public void show() {
		System.out.println(5);
	}
}

public class LambdaExample {

	public static void main(String[] args) {

		A obj = new Xyz();

		obj.show();
	}
}
//anonymous cls
/*
 * obj = new A() { public void show() { System.out.println(5); } }
 */
