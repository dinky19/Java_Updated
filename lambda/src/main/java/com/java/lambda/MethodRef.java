package com.java.lambda;

interface Abc {
	void say();
}

public class MethodRef {

	public static class MethodReference {
		public static void saySomething() {
			System.out.println("Hello, this is static method.");
		}

		public static void main(String[] args) {
			// Referring static method
			Abc obj = MethodReference::saySomething;
			// Calling interface method
			obj.say();
		}
	}

}
