package com.employeeswage;

public class EmployeeWage {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHours = 20;
	public static final int numberOfWorkingDays = 20;
	public static final int maxHoursIntMonth = 100;

	public static void main(String[] args) {
		int empHr;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;

		System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
		while (totalEmpHrs <= maxHoursIntMonth && totalWorkingDays < numberOfWorkingDays) {

			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			;
			/** int rand_int2 = rand.nextInt(1000); */

			/** Print random integers */
			System.out.println("Random Integers: " + empCheck);
			// System.out.println("Random Integers: "+rand_int2);

			switch (empCheck) {
			case 1:
				empHr = 8;
				System.out.print("Full time");
				break;
			case 2:
				empHr = 4;
				System.out.print("Part time");
				break;
			case 0:
				empHr = 0;
				System.out.println("Absent");
				break;

			default:
				empHr = 0;
				break;
			}
			empWage = empHr * empRatePerHours;
			totalEmpWage = totalEmpWage + empWage;
			System.out.println("Days" + totalWorkingDays + "emphrs" + empHr);
			System.out.println("Wage : " + totalEmpWage);

		}

		totalEmpWage = totalEmpWage + empWage;
		System.out.println("Total emp wage for company: " + totalEmpWage);


	}

}
