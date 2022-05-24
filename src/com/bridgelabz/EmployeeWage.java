package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullTimeHour = 8;
		int partTimeHour = 4;
		int workingDay = 20;
		int workingHours = 100;

		int empWage = 0;
		int totalwage = 0;
		int totalworkinghours = 0;
		int totalworkingdays = 0;

		while (totalworkingdays < workingDay && totalworkinghours < workingHours) {

			Random random = new Random();
			int empPresent = random.nextInt(3);
			System.out.println("Random Value for Employee Attendance is :" + empPresent);

			int x;
			switch (empPresent) {
			case 1:
				x = wagePerHour * fullTimeHour;
				empWage = empWage + x;
				totalworkinghours = totalworkinghours + fullTimeHour;
				System.out.println("Employee is present and the wage is : " + empWage);
				totalworkingdays++;
				break;

			case 2:
				x = wagePerHour * partTimeHour;
				empWage = empWage + x;
				totalworkinghours = totalworkinghours + partTimeHour;
				System.out.println("Employee is Part time present and the wage is : " + empWage);
				totalworkingdays++;
				break;

			default:
				System.out.println("Employee is absent and the wage is : " + empWage);
				break;

			}

		}
		System.out.println(" ");
		System.out.println("Total Working Days :" + totalworkingdays);
		System.out.println("Total Working Hours :" + totalworkinghours);
		System.out.println("Total wage of employee for the month is : " + empWage);
	}
}
