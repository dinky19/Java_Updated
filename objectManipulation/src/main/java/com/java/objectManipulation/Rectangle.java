package com.java.objectManipulation;

public class Rectangle {
	private float length, breadth;

	float areaOfRectangle(float length, float breadth) throws Exception {

		if (length == 0 || breadth == 0) {
			throw new Exception("Length or Breadth Cant be 0");
		} else {
			return length * breadth;
		}
	}

	public boolean areaTest(float rectangleOneArea, float rectangleTwoArea) {
		if (rectangleOneArea == rectangleTwoArea)
			return true;
		return false;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

}
