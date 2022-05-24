package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullTimeHour = 8;
		int partTimeHour = 4;

		Random random = new Random();
		int empPresent = random.nextInt(3);
		System.out.println("Random Value for Employee Attendance is :" + empPresent);

		int empWage = 0;

		switch (empPresent) {
		case 1: {
			empWage = wagePerHour * fullTimeHour;
			System.out.println("Employee is present and the wage is : " + empWage);
			break;

		}
		case 2: {
			empWage = wagePerHour * partTimeHour;
			System.out.println("Employee is Part time present and the wage is : " + empWage);
			break;
		}
		default: {
			System.out.println("Employee is absent and the wage is : " + empWage);
			break;
		}
		}

	}
}
