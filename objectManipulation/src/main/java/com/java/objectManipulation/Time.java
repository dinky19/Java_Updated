package com.java.objectManipulation;

public class Time {
	int hours;
	int min;

	public int getHours() {
		return hours;
	}

	public int getMin() {
		return min;
	}

	public void set(int hrs, int mins) {
		hours = hrs;
		min = mins;
	}

	public void display() {
		if (min > 10)
			System.out.println("TIME: " + this.hours + ":" + this.min);
		else
			System.out.println("TIME: " + this.hours + ":0" + this.min);
	}

	public static Time sum(Time t1, Time t2) {
		Time t3 = new Time();
		int hrs = t1.hours + t2.hours;
		int mins = t1.min + t2.min;
		if (hrs > 12) {
			hrs = hrs - 12;
		}
		if (mins > 60) {
			hrs++;
			mins = mins - 60;
		}
		t3.set(hrs, mins);
		return t3;
	}
}
