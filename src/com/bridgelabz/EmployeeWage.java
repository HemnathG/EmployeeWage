package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullDayHour = 8;

		Random random = new Random();
		int empPresent = random.nextInt(2);
		System.out.println("Random Value for Employee is :" + empPresent);

		int empWage = 0;
		if (empPresent == 0) {
			System.out.println("Employee is Absent");
		} else {
			empWage = wagePerHour * fullDayHour;
			System.out.println("Employee is Present");
		}
		System.out.println("Employee Wage:" + empWage);
	}
}
