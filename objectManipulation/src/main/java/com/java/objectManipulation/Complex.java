package com.java.objectManipulation;

public class Complex {
	private float real;
	private float imaginary;

	public Complex(float real,float imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}

	void set(float real, float img) {
		this.real = real;
		imaginary = img;
	}

	public float getReal() {
		return real;
	}

	public static Complex sum(Complex c1, Complex c2) {
		Complex c3 = new Complex(0, 0);
		c3.real = c1.real + c2.real;
		c3.imaginary = c1.imaginary + c2.imaginary;
		return c3;
	}

	public void display() {
		System.out.println(this.real + "+" + this.imaginary + "i");
	}

	public float getImaginary() {
		return imaginary;
	}
}
