package com.employeeswage;

import java.util.Random;

public class EmployeeWage {
	int wagePerHours = 20;
	int dailyHours = 8;
	int dailyWage;
	int partTimeWage;
	int partTimeHours = 4;
	int employeeHour;
	int daysPerMonth = 20;
	int monthlyWage;

	public void employeeAttdence() {
		int empCheck = (int) (Math.random() * 10) % 2;
		System.out.println(empCheck);
		if (empCheck == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public void dailyWage() {
		dailyWage = wagePerHours * dailyHours;
		System.out.println("Employee Daily wage = " + dailyWage);
	}

	public void employeePartTimeWage() {

		partTimeWage = wagePerHours * partTimeHours;
		System.out.println("Employee Part Time Wage :" + partTimeWage);
	}

	public void bySwitchCase() {
		Random ran = new Random();
		int empCheck = ran.nextInt(3);
		switch (empCheck) {
		case 0:
			employeeHour = 8;
			System.out.print("Present");
			break;
		case 1:
			employeeHour = 4;
			System.out.print("Part Time");
			break;
		case 2:
			employeeHour = 0;
			System.out.println("Absent");
			break;
		}
		System.out.println();
	}

	public void monthlyWage() {

		monthlyWage = dailyWage * daysPerMonth;
		System.out.println("Monthly Wage Of Employee is =" + monthlyWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage object = new EmployeeWage();
		object.employeeAttdence();
		object.dailyWage();
		object.employeePartTimeWage();
		object.bySwitchCase();
		object.monthlyWage();
	}
}
