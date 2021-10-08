package com.employeeswage;

import java.util.Scanner;

class Employee {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHours = 20;
	int numberOfWorkingDays;
	int maxHoursIntMonth;
	int empCheck;
	int empHr;
	int empWage;
	int totalEmpWage;
	int totalWorkingDays;
	int totalEmpHrs;

	int numOfDays(int numOfWorkingDays) {
		numberOfWorkingDays = numOfWorkingDays;

		return numberOfWorkingDays;
	}

	int workingHrs(int maxHrInMonth) {

		maxHoursIntMonth = maxHrInMonth;

		return maxHoursIntMonth;
	}

	int CalculateWage() {
		while (totalEmpHrs <= maxHoursIntMonth && totalWorkingDays < numberOfWorkingDays) {
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("" + empCheck);

			totalWorkingDays++;

			switch (empCheck) {
			case 1:
				empHr = 8;
				System.out.print("full time");
				break;
			case 2:
				empHr = 4;
				System.out.print("part time");
				break;
			case 0:
				empHr = 0;
				System.out.println("absent");
				break;

			default:
				empHr = 0;
				break;
			}
			empWage = empHr * empRatePerHours;
			totalEmpWage = totalEmpWage + empWage;
			System.out.println("days" + totalWorkingDays + "emphrs" + empHr);
			System.out.println("wage" + totalEmpWage);
		}
		return totalEmpWage;
	}
}

public class Object {

	public static void main(String[] args) {
		Employee company = new Employee();
		// int Check= (int) (Math.floor(Math.random()*10)%3);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Days:");
		int Days = sc.nextInt();
		System.out.println("enter Hrs:");
		int Hrs = sc.nextInt();
		company.numOfDays(Days);
		company.workingHrs(Hrs);
		company.CalculateWage();

	}
}
