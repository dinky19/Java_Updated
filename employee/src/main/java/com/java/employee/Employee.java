package com.java.employee;

public class Employee {
	private int Id;
	private int monthlyBasic;
	private String name;
	private int medicalAllowance = 1250;
	private int conAllow = 800;
	private double esc;

	Employee(int Id, int monthlyBasic, String name){
	this.Id=Id;
	this.monthlyBasic=monthlyBasic;
	this.name=name;
	}


	int getHRA() {
		return (monthlyBasic / 2);
	}

	int getPF() {
		if ((monthlyBasic / 10) < 6500) {
			return (monthlyBasic / 10);
		} else
			return 6500;
	}

	double getESIC() {
		if (monthlyBasic < 5000)
			esc = ((monthlyBasic / 100) * 4.75);
		return esc;
	}

	int getProfTax() {
		if (getMonthlyGrossSalary() <= 10000)
			return 50;
		else
			return 100;
	}
	// double setPFrate

	int getAnnualBasic() {
		return (12 * monthlyBasic);
	}

	int getMonthlyGrossSalary() {
		return (monthlyBasic + getHRA() + medicalAllowance + conAllow);
	}

	int getannualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
	}

	double getMonthlyDeductions() {
		return (getPF() + getESIC() + getProfTax());
	}

	double getMonthlyTakeHome() {
		return (getMonthlyGrossSalary() - getMonthlyDeductions());
	}

	double getAnnualTakeHome() {
		return 12 * getMonthlyTakeHome();

	}
}
